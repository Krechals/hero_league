package engine;

import angel.Angel;
import logs.DataBlank;
import logs.DataKill;
import logs.DataNewRound;
import hero.Hero;
import logs.DataSpawn;
import main.GameInput;
import map.GameMap;
import setup.AngelFactory;
import setup.SingletonHeroList;

import java.util.List;

public final class GameProgress {
    private GameProgress() {
        // NOT CALLED
    }
    private static boolean areHerosOnTerrain(final GameMap map, final int x, final int y) {
        return map.getMapPlayer1().get(x).get(y)
                != null && map.getMapPlayer2().get(x).get(y) != null;
    }
    public static void play(final GameInput gameInput) {
        int noHeros = gameInput.getPlayersNumber();
        int noRounds = gameInput.getRounds();
        int currentAngel = 0;
        List<Hero> heros = SingletonHeroList.getInstance().getHeroes();
        GameMap map = GameMap.getInstance(gameInput.getTerrain());
        AngelFactory angelFactory = AngelFactory.getInstance();
        DataRepository dataRepository = DataRepository.getInstance();
        dataRepository.addObserver(GreatMagician.getInstance());

        for (int round = 0; round < noRounds; ++round) {
            dataRepository.addData(new DataNewRound(round + 1));
            // Moves
            for (Hero currentHero : heros) {
                // Remove heros previous location on map
                map.setHeroOnMap(null, currentHero.getxLocation(), currentHero.getyLocation());
            }
            // Give overtime damage
            for (Hero h : heros) {
                h.overtimeDamage();
            }
            // Update heros current location on map
            for (int heroID = 0; heroID < noHeros; ++heroID) {
                Hero currentHero = heros.get(heroID);

                // Check if current hero is alive
                if (heros.get(heroID).isAlive()) {
                    char operation = gameInput.getPlayersMoves().get(round).charAt(heroID);

                    // Check if current hero is paralysed
                    if (!heros.get(heroID).isParalized()) {
                        heros.get(heroID).move(operation);
                    }
                    heros.get(heroID).decreaseParalizedTime();
                    map.setHeroOnMap(currentHero, currentHero.getxLocation(),
                                    currentHero.getyLocation());
                    heros.get(heroID).setTerrain(map.getTerrain(currentHero.getxLocation(),
                                    currentHero.getyLocation()));
                }
            }
            // Attacks
            int lines = gameInput.getLineSize();
            int columns = gameInput.getColumnSize();
            for (int i = 0; i < lines; ++i) {
                for (int j = 0; j < columns; ++j) {
                    // Check if there are 2 players on a terrain
                    if (areHerosOnTerrain(map, i, j)) {
                        Hero h1 = map.getMapPlayer1().get(i).get(j);
                        Hero h2 = map.getMapPlayer2().get(i).get(j);

                        h2.isAttackedBy(h1);
                        h1.isAttackedBy(h2);

                        // Update xp if we have a winner
                        if (!h2.isAlive()) {
                            dataRepository.addData(new DataKill(h1, h2));
                            if (h1.isAlive()) {
                                h1.setXP(h2.getLevel());
                            }
                        }
                        if (!h1.isAlive()) {
                            dataRepository.addData(new DataKill(h2, h1));
                            if (h2.isAlive()) {
                                h2.setXP(h1.getLevel());
                            }
                        }
                    }
                }
            }
            for (int angelID = 0; angelID < gameInput.getAngelRound().get(round); angelID++) {
                Angel newAngel = angelFactory.createAngel(gameInput.getAngelType().get(currentAngel), gameInput.getAngelLocation().get(2 * currentAngel), gameInput.getAngelLocation().get(2 * currentAngel + 1));
                dataRepository.addData(new DataSpawn(newAngel, newAngel.getxLocation(), newAngel.getyLocation()));
                for (int heroID = 0; heroID < noHeros; ++heroID) {
                    Hero currentHero = heros.get(heroID);
                    if (currentHero.getxLocation() == newAngel.getxLocation() && currentHero.getyLocation() == newAngel.getyLocation()) {
                        currentHero.isHelpedBy(newAngel);
                    }
                }
                ++currentAngel;
            }
            dataRepository.addData(new DataBlank());
        }
    }
}
