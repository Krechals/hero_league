package logs;

import angel.Angel;
import hero.Hero;

public class DataHit implements DataInterface {
    private Angel angel;
    private Hero hero;

    public DataHit(Angel a, Hero h) {
        angel = a;
        hero = h;
    }
    @Override
    public String toString() {
        return angel.getName() + " hit " + hero.getName() + " " + hero.getID();
    }
}
