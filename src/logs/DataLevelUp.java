package logs;

import hero.Hero;

public class DataLevelUp implements DataInterface{
    private Hero hero;

    public DataLevelUp(Hero h) {
        hero = h;
    }
    @Override
    public String toString() {
        return hero.getName() + " " + hero.getID() + " reached level " + hero.getLevel();
    }
}
