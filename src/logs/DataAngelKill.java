package logs;

import hero.Hero;

public class DataAngelKill implements DataInterface {
    private Hero hero;

    public DataAngelKill(final Hero h) {
        hero = h;
    }
    @Override
    public final String toString() {
        return "Player " + hero.getName() + " " + hero.getID() + " was killed by an angel";
    }
}
