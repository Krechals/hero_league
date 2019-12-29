package setup;

import hero.Hero;

import java.util.ArrayList;
import java.util.List;

public class SingletonAngelList {
    private static SingletonAngelList instance;
    private List<Hero> angels;

    private SingletonAngelList() {
        angels = new ArrayList<>();
    }

    public static SingletonAngelList getInstance() {
        if (instance == null) {
            instance = new SingletonAngelList();
        }
        return instance;
    }
    void addHero(final Hero h) {
        angels.add(h);
    }
    public List<Hero> getHeroes() {
        return angels;
    }
}
