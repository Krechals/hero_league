package setup;


import angel.Angel;
import angel.DamageAngel;
import angel.Spawner;
import angel.TheDoomer;
import angel.Dracula;
import angel.XPAngel;
import angel.SmallAngel;
import angel.GoodBoy;
import angel.LifeGiver;
import angel.LevelUpAngel;
import angel.DarkAngel;

public final class AngelFactory {
    private static AngelFactory instance;

    private AngelFactory() {
        // NOT CALLED
    }
    public static AngelFactory getInstance() {
        if (instance == null) {
            instance = new AngelFactory();
        }
        return instance;
    }
    // Factory Design Pattern - Creating Angels
    public Angel createAngel(final String type, final int x, final int y) {
        if (type.equals("Spawner")) {
            return new Spawner(x, y);
        } else if (type.equals("TheDoomer")) {
            return new TheDoomer(x, y);
        } else if (type.equals("DamageAngel")) {
            return new DamageAngel(x, y);
        } else if (type.equals("Dracula")) {
            return new Dracula(x, y);
        } else if (type.equals("XPAngel")) {
            return new XPAngel(x, y);
        } else if (type.equals("SmallAngel")) {
            return new SmallAngel(x, y);
        } else if (type.equals("GoodBoy")) {
            return new GoodBoy(x, y);
        } else if (type.equals("LifeGiver")) {
            return new LifeGiver(x, y);
        } else if (type.equals("LevelUpAngel")) {
            return new LevelUpAngel(x, y);
        } else if (type.equals("DarkAngel")) {
            return new DarkAngel(x, y);
        }
        return null;
    }
}
