package logs;

import angel.Angel;
import hero.Hero;

public class DataHelp implements DataInterface{
    private Angel angel;
    private Hero hero;

    public DataHelp(Angel a, Hero h) {
        angel = a;
        hero = h;
    }
    public String toString() {
        return angel.getName() + " helped " + hero.getName() + " " + hero.getID();
    }

}
