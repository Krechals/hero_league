package ability;

import hero.Hero;

public class DamageAbility extends Ability {
    private float terrainAmplifier;
    private float raceAmplifier;
    protected float damage;
    protected int initialDamage;
    protected float bonusDamage;

    public DamageAbility() {
        terrainAmplifier = 1f;
        raceAmplifier = 1f;
        damage = 0.0f;
    }

    /**
     * Getter for the amplifier percent of current ability.
     * @return Terrain amplifier percent of current ability
     */
    public float getTerrainAmplifier() {
        return terrainAmplifier;
    }

    /**
     * Getter for the amplifier percent of current ability.
     * @return Race amplifier percent of current ability
     */
    public float getRaceAmplifier() {
        return raceAmplifier;
    }

    @Override
    public final void setRaceAmplifier(final float amplifier) {
        if (amplifier != 1.0f) {
            raceAmplifier = amplifier + angelBonus + strategyBonus;
        }
   }
    @Override
    public final void setTerrainAmplifier(final float amplifier) {
        terrainAmplifier = amplifier;
    }

    /**
     * @param h: Hero that receives Deflect from Wizard.
     * @return Damage that the hero receives from Wizard by Deflect ability.
     */
    @Override
    public int noRaceModifiersDamage(final Hero h) {
        return Math.round(damage * terrainAmplifier);
    }

    /**
     * @param h: Hero to be attacked.
     * @return Damage of the current ability.
     */
    @Override
    public int getBaseDamage(final Hero h) {
        return Math.round(Math.round(damage * terrainAmplifier)  * raceAmplifier);
    }

    /**
     * @param h: Hero to be attacked
     * @param wiz: Wizard that Deflects damage
     * @return Damage of the current ability.
     */
    @Override
    public int getBaseDamage(final Hero h, final Hero wiz) {
        // implemented int subclass
        return 0;
    }

    /**
     * Updates current ability of a specific hero.
     * @param level Level of the hero
     */
    @Override
    public void updateSkill(final int level) {
        damage = damage + bonusDamage;
    }
}
