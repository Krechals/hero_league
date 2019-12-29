package logs;

import hero.Hero;

public class DataRevive implements DataInterface{
    private Hero hero;

    public DataRevive(Hero h) {
        hero = h;
    }
    @Override
    public String toString() {
        return "Player " + hero.getName() + " " + hero.getID() + " was brought to life by an angel";
    }
}
