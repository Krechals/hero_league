package ability;

import hero.Hero;

public abstract class Ability {
    /**
     * @param h
     * @return
     */
    public int getParalizedRounds(final Hero h) {
        // implemented in subclass
        return 0;
    }

    /**
     * @return
     */
    public int getOvertimeDamage() {
        // implemented in subclass
        return 0;
    }

    /**
     * @return
     */
    public int getTimeDamage() {
        // implemented in subclass
        return 0;
    }

    /**
     * @param h
     * @param wiz
     * @return
     */
    public int getBaseDamage(final Hero h, final Hero wiz) {
        // implemented in subclass
        return 0;
    }
    abstract int noRaceModifiersDamage(Hero h);
    public abstract void setTerrainAmplifier(float amplifier);
    public abstract void setRaceAmplifier(float amplifier);
    public abstract int getBaseDamage(Hero h);
    public abstract void updateSkill(int level);
}
