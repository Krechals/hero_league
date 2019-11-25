package main;

import hero.Hero;
import setup.HeroSetup;
import setup.SingletonHeroList;

import java.util.List;

public class Main {
    private Main() {
        // just to trick checkstyle
    }
    public static void main(String[] args) {
        // Gets data from input
        GameInputLoader gameInputLoader = new GameInputLoader(args[0], args[1]);
        GameInput gameInput = gameInputLoader.load();

        HeroSetup.setup(gameInput.getPlayersType(), gameInput.getPlayersLocation());
        List<Hero> heros = SingletonHeroList.getInstance().getHeroes();
        System.out.println(heros.get(0).getxLocation() + " " + heros.get(0).getxLocation());
    }
}
