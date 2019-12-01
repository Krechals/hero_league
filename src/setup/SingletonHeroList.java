package setup;

import hero.Hero;

import java.util.ArrayList;
import java.util.List;

public final class SingletonHeroList {
    private static SingletonHeroList instance;
    private List<Hero> heros;

    private SingletonHeroList() {
        heros = new ArrayList<>();
    }

    public static SingletonHeroList getInstance() {
        if (instance == null) {
            instance = new SingletonHeroList();
        }
        return instance;
    }
    void addHero(final Hero h) {
        heros.add(h);
    }
    public List<Hero> getHeroes() {
        return heros;
    }
}
