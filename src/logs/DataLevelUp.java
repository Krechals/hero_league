package logs;

import hero.Hero;

public class DataLevelUp implements DataInterface {
    private Hero hero;

    public DataLevelUp(final Hero h) {
        hero = h;
    }
    @Override
    public final String toString() {
        return hero.getName() + " " + hero.getID() + " reached level " + hero.getLevel();
    }
}
