package setup;

import hero.*;

public class HeroFactory {
    public static final HeroFactory INSTANCE = new HeroFactory();

    private HeroFactory() { }

    // Factory Design Pattern
    public Hero createHero(String type, int id, int x, int y) {
        if (type.equals("K")) {
            return new Knight(id, x, y);
        } else if (type.equals("P")) {
            return new Pyromancer(id, x ,y);
        } else if (type.equals("R")) {
            return new Rogue(id, x, y);
        }
        return new Wizard(id, x, y);
    }
}
