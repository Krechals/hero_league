package ability;

import hero.Hero;

public class DamageAbility extends Ability {
    private float terrainAmplifier;
    private float raceAmplifier;
    protected int damage;
    protected int bonusDamage;

    public DamageAbility() {
        terrainAmplifier = 1;
        raceAmplifier = 1;
        damage = 0;
    }

    /**
     * @return
     */
    public float getTerrainAmplifier() {
        return terrainAmplifier;
    }

    /**
     * @return
     */
    public float getRaceAmplifier() {
        return raceAmplifier;
    }

    @Override
    public final void setRaceAmplifier(final float amplifier) {
        raceAmplifier = amplifier;
    }
    @Override
    public final void setTerrainAmplifier(final float amplifier) {
        terrainAmplifier = amplifier;
    }

    /**
     * @param h
     * @return
     */
    @Override
    public int noRaceModifiersDamage(final Hero h) {
        return Math.round(damage * terrainAmplifier);
    }

    /**
     * @param h
     * @return
     */
    @Override
    public int getBaseDamage(final Hero h) {
        return Math.round(damage * terrainAmplifier * raceAmplifier);
    }

    /**
     * @param h
     * @param wiz
     * @return
     */
    @Override
    public int getBaseDamage(final Hero h, final Hero wiz) {
        // implemented int subclass
        return 0;
    }

    /**
     * @param level
     */
    @Override
    public void updateSkill(final int level) {
        damage = damage + level * bonusDamage;
    }
}
