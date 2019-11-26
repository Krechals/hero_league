package engine;

import hero.Hero;
import main.GameInput;
import map.GameMap;
import map.TerrainList;
import setup.SingletonHeroList;

import java.util.List;

public class GameProgress {
    private static boolean areHerosOnTerrain(GameMap map, int x, int y) {
        return map.getMapPlayer1().get(x).get(y) != null && map.getMapPlayer2().get(x).get(y) != null;
    }
    public static void play(GameInput gameInput) {
        int noHeros = gameInput.getPlayersNumber();
        int noRounds = gameInput.getRounds();
        List<Hero> heros = SingletonHeroList.getInstance().getHeroes();
        GameMap map = GameMap.getInstance(gameInput.getTerrain());
        // Moves
        for (int round = 0; round < noRounds; ++round) {
            // Moves
            for (Hero currentHero : heros) {
                // Remove heros previous location on map
                map.setHeroOnMap(null, currentHero.getxLocation(), currentHero.getyLocation());
            }
            for (int heroID = 0; heroID < noHeros; ++heroID) {
                Hero currentHero = heros.get(heroID);

                // Update heros current location on map
                char operation = gameInput.getPlayersMoves().get(round).charAt(heroID);
                if (heros.get(heroID).isAlive()) {
                    heros.get(heroID).move(operation);
                    map.setHeroOnMap(currentHero, currentHero.getxLocation(), currentHero.getyLocation());
                    // System.out.println(map.getMapPlayer1().get(0).get(0));
                }
            }

            // Attacks
            int lines = gameInput.getLineSize();
            int columns = gameInput.getColumnSize();
            for (int i = 0; i < lines; ++i) {
                for (int j = 0; j < columns; ++j) {
                    // Give overtime damage
                    for (Hero h : heros) {
                        h.overtimeDamage();
                    }
                    // Check if there are 2 players on a terrain
                    if (areHerosOnTerrain(map, i, j)) {
                        Hero h1 = map.getMapPlayer1().get(i).get(j);
                        Hero h2 = map.getMapPlayer2().get(i).get(j);
                        TerrainList terrainType = map.getMapTerrain().get(i).get(j);
                        h1.isAttackedBy(h2, terrainType);
                        h2.isAttackedBy(h1, terrainType);
                    }

                }
            }

        }
        Scoreboard.print();
    }
}
