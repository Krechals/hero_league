package setup;

import common.Constants;
import hero.Hero;
import hero.Knight;
import hero.Pyromancer;
import hero.Rogue;
import hero.Wizard;

final class HeroFactory {
    static final HeroFactory INSTANCE = new HeroFactory();

    private HeroFactory() {
        // NOT CALLED
    }

    // Factory Design Pattern - Creating Heros
    Hero createHero(final String type, final int id, final int x, final int y) {
        switch (type) {
            case Constants.KNIGHT_INITIAL:
                return new Knight(id, x, y);
            case Constants.PYRO_INITIAL:
                return new Pyromancer(id, x, y);
            case Constants.ROGUE_INITIAL:
                return new Rogue(id, x, y);
            default:
                return new Wizard(id, x, y);
        }
    }
}
