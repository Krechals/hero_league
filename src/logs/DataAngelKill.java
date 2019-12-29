package logs;

import hero.Hero;

public class DataAngelKill implements DataInterface{
    private Hero hero;

    public DataAngelKill(Hero h) {
        hero = h;
    }
    @Override
    public String toString() {
        return "Player " + hero.getName() + " " + hero.getID() + " was killed by an angel";
    }
}
