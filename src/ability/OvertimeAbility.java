package ability;

import hero.Hero;

public class OvertimeAbility extends Ability {
    private float terrainAmplifier;
    private float raceAmplifier;
    protected int damage;
    protected int bonusDamage;
    protected int overtimeDamage;
    protected int overtimeBonus;
    protected int timeDamage;
    protected int paralizedRounds;

    public OvertimeAbility() {
        terrainAmplifier = 1;
        raceAmplifier = 1;
        damage = 0;
        overtimeDamage = 0;
        timeDamage = 0;
        paralizedRounds = 0;
    }
    /**
     * @param h: Hero that receives Deflect from Wizard.
     * @return Damage that the hero receives from Wizard by Deflect ability.
     */
    @Override
    public final int noRaceModifiersDamage(final Hero h) {
        return Math.round(damage * terrainAmplifier);
    }

    /**
     * @param h: Hero to be attacked.
     * @return Damage of the current ability.
     */
    @Override
    public final int getBaseDamage(final Hero h) {
        return Math.round(damage * terrainAmplifier * raceAmplifier);
    }

    /**
     * Paralyses a hero with current ability.
     * @param h: Hero to be paralysed
     * @return Rounds that attacker paralyses a hero
     */
    @Override
    public int getParalizedRounds(final Hero h) {
        return paralizedRounds;
    }

    /**
     * @return Overtime damage of the current ability
     */
    @Override
    public int getOvertimeDamage() {
        return Math.round(overtimeDamage * terrainAmplifier * raceAmplifier);
    }

    /**
     * @return Number of rounds that Overtime damage has effect
     */
    @Override
    public int getTimeDamage() {
        return timeDamage;
    }

    /**
     * Updates current ability of a specific hero.
     * @param level Level of the hero
     */
    @Override
    public void updateSkill(final int level) {
        damage = damage + level * bonusDamage;
    }
    @Override
    public final void setRaceAmplifier(final float amplifier) {
        raceAmplifier = amplifier;
    }
    @Override
    public final void setTerrainAmplifier(final float amplifier) {
        terrainAmplifier = amplifier;
    }
}
