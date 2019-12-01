package main;

import engine.GameProgress;
import engine.Scoreboard;
import setup.HeroSetup;

public final class Main {
    private Main() {
        // just to trick checkstyle
    }
    public static void main(final String[] args) {
        // Gets data from input
        GameInputLoader gameInputLoader = new GameInputLoader(args[0], args[1]);
        GameInput gameInput = gameInputLoader.load();
        HeroSetup.setup(gameInput.getPlayersType(), gameInput.getPlayersLocation());

        GameProgress.play(gameInput);

        Scoreboard.print(args[0], args[1]);
    }
}
