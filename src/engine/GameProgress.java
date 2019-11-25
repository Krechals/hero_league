package engine;

import hero.Hero;
import main.GameInput;
import map.GameMap;
import setup.SingletonHeroList;

import java.util.List;

public class GameProgress {
    public static void play(GameInput gameInput) {
        int noHeros = gameInput.getPlayersNumber();
        int noRounds = gameInput.getRounds();
        List<Hero> heros = SingletonHeroList.getInstance().getHeroes();
        GameMap map = GameMap.getInstance(gameInput.getTerrain());
        // Moves
        for (int round = 0; round < noRounds; ++round) {
            for (int heroID = 0; heroID < noHeros; ++heroID) {
                Hero currentHero = heros.get(heroID);
                // Remove heros previous location on map
                map.setHeroOnMap(null, currentHero.getxLocation(), currentHero.getyLocation());

                // Update heros current location on map
                char operation = gameInput.getPlayersMoves().get(round).charAt(heroID);
                heros.get(heroID).move(operation);
                map.setHeroOnMap(currentHero, currentHero.getxLocation(), currentHero.getyLocation());
            }
        }
    }
}
