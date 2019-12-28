package DataLogs;

import hero.Hero;

public class DataKill implements DataInterface{
    private Hero attacker;
    private Hero defender;

    public DataKill(Hero h1, Hero h2) {
        attacker = h1;
        defender = h2;
    }
    @Override
    public String toString() {
        return "Player " + defender.getName() + " " + defender.getID() + " was killed by " + attacker.getName() + " " + attacker.getID();
    }

}
