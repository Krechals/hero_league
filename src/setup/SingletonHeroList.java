package setup;

import hero.Hero;

import java.util.ArrayList;
import java.util.List;

public class SingletonHeroList {
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
    public void addHero(Hero h) {
        heros.add(h);
    }
    public List<Hero> getHeroes() {
        return heros;
    }
}
