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
    public Angel(int x, int y) {
        xLocation = x;
        yLocation = y;

    }
    public int getxLocation() {
        return xLocation;
    }
    public int getyLocation() {
        return yLocation;
    }

    public abstract void help(Knight knight);
    public abstract void help(Pyromancer pyro);
    public abstract void help(Rogue rogue);
    public abstract void help(Wizard wiz);
    public abstract String getName();
}
