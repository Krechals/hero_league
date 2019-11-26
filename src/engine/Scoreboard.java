package engine;

import hero.Hero;
import setup.SingletonHeroList;

import java.util.List;

public class Scoreboard {
    public static void print() {
        List<Hero> heros = SingletonHeroList.getInstance().getHeroes();
        for (Hero h : heros) {
            System.out.print(h.getInitial() + " ");
            if (h.isAlive()) {
                System.out.println(h.getLevel() + " " + h.getXP() + " " + h.getHP() + " " + h.getxLocation() + " " + h.getyLocation());
            } else {
                System.out.println("DEAD");
            }
        }
    }
}
