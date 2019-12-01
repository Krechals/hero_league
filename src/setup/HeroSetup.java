package setup;

import hero.Hero;
import java.util.List;

public final class HeroSetup {

    private HeroSetup() {
        // NOT CALLED
    }

    /**
     * Hero creator class.
     * @param playersType: String lists of heros in the game
     * @param playersLocation: Hero's initial location on map
     */
    public static void setup(final List<String> playersType,
                             final List<Integer> playersLocation) {
        SingletonHeroList instance = SingletonHeroList.getInstance();
        Hero hero;
        for (int id = 0, j = 0; id < playersType.size(); ++id, j += 2) {
            int x = playersLocation.get(j);
            int y = playersLocation.get(j + 1);
            hero = HeroFactory.INSTANCE.createHero(playersType.get(id), x, y);
            instance.addHero(hero);
        }
    }
}
