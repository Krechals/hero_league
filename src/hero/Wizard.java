package hero;

import ability.AbilityFactory;
import ability.AbilityList;
import angel.Angel;
import common.Constants;
import map.TerrainList;
import strategy.BasicStrategy;
import strategy.WizardAggressive;
import strategy.WizardPassive;

public class Wizard extends Hero {
    private int prevHP;
    public Wizard(final int id, final int x, final int y) {
        super(Constants.WIZ_HP, Constants.WIZ_BONUS_HP, id, x, y);
        initial = 'W';
        prevHP = Constants.WIZ_HP;
        a1 = AbilityFactory.getInstance().createAbility(AbilityList.DRAIN);
        a2 = AbilityFactory.getInstance().createAbility(AbilityList.DEFLECT);
    }
    final void setPrevHP() {
        prevHP = this.getHP();
    }
    public final int getPrevHP() {
        return prevHP;
    }
    /**
     * Attack method that applies to all heros.
     * @param h: Hero to be attacked
     */
    private void attackHero(final Hero h) {
        h.decreaseHP(a1.getBaseDamage(h));
        h.decreaseHP(a2.getBaseDamage(h, this));
        if (h.getHP() <= 0) {
            h.killPlayer();
        }
    }
    // Visitor accept method
    @Override
    public final void isAttackedBy(final Hero hero) {
        hero.attack(this);
    }
    /**
     * Set amplifiers for the hero that attacks.
     * @param terrain: Terrain of the battle
     */
    private void setTerrainAmplifier(final TerrainList terrain) {
        if (terrain == TerrainList.DESERT) {
            a1.setTerrainAmplifier(Constants.WIZ_LAND_AMPLIFIER);
            a2.setTerrainAmplifier(Constants.WIZ_LAND_AMPLIFIER);
        } else {
            a1.setTerrainAmplifier(Constants.NO_APLIFICATION);
            a2.setTerrainAmplifier(Constants.NO_APLIFICATION);
        }
    }
    /**
     * Wizard attacks a Knight.
     * @param knight: Knight to be attacked
     */
    @Override
    public final void attack(final Knight knight) {
        a1.setRaceAmplifier(Constants.WIZ_ATTACKS_KNIGHT_AMPLIFIER_1);
        a2.setRaceAmplifier(Constants.WIZ_ATTACKS_KNIGHT_AMPLIFIER_2);
        this.setTerrainAmplifier(knight.getTerrain());

        attackHero(knight);
    }
    /**
     * Wizard attacks a Pyromancer.
     * @param pyro: Pyromancer to be attacked
     */
    @Override
    public final void attack(final Pyromancer pyro) {
        a1.setRaceAmplifier(Constants.WIZ_ATTACKS_PYRO_AMPLIFIER_1);
        a2.setRaceAmplifier(Constants.WIZ_ATTACKS_PYRO_AMPLIFIER_2);
        this.setTerrainAmplifier(pyro.getTerrain());

        attackHero(pyro);
    }
    /**
     * Wizard attacks a Rogue.
     * @param rogue: Rogue to be attacked
     */
    @Override
    public final void attack(final Rogue rogue) {
        a1.setRaceAmplifier(Constants.WIZ_ATTACKS_ROGUE_AMPLIFIER_1);
        a2.setRaceAmplifier(Constants.WIZ_ATTACKS_ROGUE_AMPLIFIER_2);
        this.setTerrainAmplifier(rogue.getTerrain());

        attackHero(rogue);
    }
    /**
     * Wizard attacks a Wizard.
     * @param wiz: Wizard to be attacked
     */
    @Override
    public final void attack(final Wizard wiz) {
        a1.setRaceAmplifier(Constants.WIZ_ATTACKS_WIZ_AMPLIFIER_1);
        this.setTerrainAmplifier(wiz.getTerrain());

        wiz.setPrevHP();
        attackHero(wiz);
    }

    /**
     * Wizard has interaction with an Angel.
     * @param angel Angel that interacts with Wizard
     */
    @Override
    public void isHelpedBy(final Angel angel) {
        angel.help(this);
    }

    /**
     * Applying a specific strategy according to Wizard's HP.
     */
    @Override
    public void setStrategy() {
        if (this.getHP() >= this.getFullHp() * Constants.HALF || this.isParalized()) {
            strategy = new BasicStrategy();
        } else if (this.getFullHp() * Constants.QUARTER < this.getHP()
                    && this.getHP() < this.getFullHp() * Constants.HALF) {
            strategy = new WizardAggressive();
            strategy.applyStrategy(this);
        } else if (this.getHP() < this.getFullHp() * Constants.QUARTER && 0 < this.getHP()) {
            strategy = new WizardPassive();
            strategy.applyStrategy(this);
        }
    }
    @Override
    public final String getName() {
        return "Wizard";
    }
}
