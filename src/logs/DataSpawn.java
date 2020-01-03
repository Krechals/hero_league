package logs;

import angel.Angel;

public class DataSpawn implements DataInterface {
    private Angel angel;
    private int xLocation;
    private int yLocation;

    public DataSpawn(final Angel a, final int x, final int y) {
        angel = a;
        xLocation = x;
        yLocation = y;
    }
    @Override
    public final String toString() {
        return "Angel " + angel.getName() + " was spawned at " + xLocation + " " + yLocation;
    }
}
