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
    @Override
    public final void setRaceAmplifier(final float amplifier) {
        raceAmplifier = amplifier;
    }
    @Override
    public final void setTerrainAmplifier(final float amplifier) {
        terrainAmplifier = amplifier;
    }
    @Override
    public final int noRaceModifiersDamage(final Hero h) {
        return Math.round(damage * terrainAmplifier);
    }
    @Override
    public final int getBaseDamage(final Hero h) {
        return Math.round(damage * terrainAmplifier * raceAmplifier);
    }

    /**
     * @param h
     * @return
     */
    @Override
    public int getParalizedRounds(final Hero h) {
        return paralizedRounds;
    }

    /**
     * @return
     */
    @Override
    public int getOvertimeDamage() {
        return Math.round(overtimeDamage * terrainAmplifier * raceAmplifier);
    }

    /**
     * @return
     */
    @Override
    public int getTimeDamage() {
        return timeDamage;
    }

    /**
     * @param level
     */
    @Override
    public void updateSkill(final int level) {
        damage = damage + level * bonusDamage;
    }
}
