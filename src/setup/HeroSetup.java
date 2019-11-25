package setup;

import hero.Hero;
import java.util.List;

public final class HeroSetup {

    public static void setup(List<String> playersType, List<Integer> playersLocation) {
        SingletonHeroList instance = SingletonHeroList.getInstance();
        Hero hero;
        for (int id = 0, j = 0; id < playersType.size(); ++id, j+=2) {
            int x = playersLocation.get(j);
            int y = playersLocation.get(j + 1);
            hero = HeroFactory.INSTANCE.createHero(playersType.get(id), id, x, y);
            instance.addHero(hero);
        }
    }
}
