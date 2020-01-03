package logs;

import hero.Hero;

public class DataKill implements DataInterface {
    private Hero attacker;
    private Hero defender;

    public DataKill(final Hero h1, final Hero h2) {
        attacker = h1;
        defender = h2;
    }
    @Override
    public final String toString() {
        return "Player " + defender.getName() + " " + defender.getID() + " was killed by "
                + attacker.getName() + " " + attacker.getID();
    }

}
