package angel;

import hero.Knight;
import hero.Pyromancer;
import hero.Rogue;
import hero.Wizard;

public abstract class Angel {
    private int xLocation;
    private int yLocation;

    public Angel() {

    }
    public Angel(final int x, final int y) {
        xLocation = x;
        yLocation = y;

    }
    public final int getxLocation() {
        return xLocation;
    }
    public final int getyLocation() {
        return yLocation;
    }

    /*
        Visitor Design Pattern
        Each angel has a different interaction with each specific hero
    */
    public abstract void help(Knight knight);
    public abstract void help(Pyromancer pyro);
    public abstract void help(Rogue rogue);
    public abstract void help(Wizard wiz);
    public abstract String getName();
}
