package ability;

import hero.Hero;

public abstract class Ability {

    protected float angelBonus = 0.0f;
    protected float strategyBonus = 0.0f;
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
    public void setAngelBonus(float bonus) {
        angelBonus = bonus;
    }
    public void setStrategyBonus(float bonus) {
        strategyBonus += bonus;
    }
    abstract int noRaceModifiersDamage(Hero h);
    public abstract void setTerrainAmplifier(float amplifier);
    public abstract void setRaceAmplifier(float amplifier);
    public abstract int getBaseDamage(Hero h);
    public abstract void updateSkill(int level);
}
