package ability;

import hero.Hero;

public abstract class Ability {

    protected float angelBonus = 0.0f;
    protected float strategyBonus = 0.0f;
    /**
     * @param h Hero to be paralyzed
     * @return Number of paralysed rounds for specific ability
     */
    public int getParalyzedRounds(final Hero h) {
        // implemented in subclass
        return 0;
    }

    /**
     * @return Overtime damage dealt for a specific ability
     */
    public int getOvertimeDamage() {
        // implemented in subclass
        return 0;
    }

    /**
     * @return Number of rounds with overtime damage of an ability
     */
    public int getTimeDamage() {
        // implemented in subclass
        return 0;
    }

    /**
     * Returns the damage dealt by Deflect; it does not involve Race Amplifier.
     * @param h Hero to be damaged
     * @param wiz Wizard that deflects hero's abilitty
     * @return Damage dealt by the Deflect Ability
     */
    public int getBaseDamage(final Hero h, final Hero wiz) {
        // implemented in subclass
        return 0;
    }
    public final void setAngelBonus(final float bonus) {
        angelBonus = bonus;
    }
    public final void setStrategyBonus(final float bonus) {
        strategyBonus += bonus;
    }

    /**
     * @param h Hero to be damaged
     * @return Damage delt by an ability without involving Race Amplifier
     */
    abstract int noRaceModifiersDamage(Hero h);
    public abstract void setTerrainAmplifier(float amplifier);
    public abstract void setRaceAmplifier(float amplifier);

    /**
     * Invoves Race Amplifier, Terrain Amplifier, Angel Bonus, Strategy Bonus.
     * @param h Hero to be damaged
     * @return Returns the base damage dealt by an ability
     */
    public abstract int getBaseDamage(Hero h);
    public abstract void updateSkill(int level);
}
