package hero;


import ability.AbilityFactory;
import ability.AbilityList;
import angel.Angel;
import common.Constants;
import map.TerrainList;
import strategy.BasicStrategy;
import strategy.PyromancerAggressive;
import strategy.PyromancerPassive;

public class Pyromancer extends Hero {
    public Pyromancer(final int id, final int x, final int y) {
        super(Constants.PYRO_HP, Constants.PYRO_BONUS_HP, id, x, y);
        initial = 'P';
        a1 = AbilityFactory.getInstance().createAbility(AbilityList.FIREBLAST);
        a2 = AbilityFactory.getInstance().createAbility(AbilityList.IGNITE);
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
        if (terrain == TerrainList.VOLCANIC) {
            a1.setTerrainAmplifier(Constants.PYRO_LAND_AMPLIFIER);
            a2.setTerrainAmplifier(Constants.PYRO_LAND_AMPLIFIER);
        } else {
            a1.setTerrainAmplifier(Constants.NO_APLIFICATION);
            a2.setTerrainAmplifier(Constants.NO_APLIFICATION);
        }
    }
    /**
     * Attack method that applies to all heros.
     * @param h: Hero to be attacked
     */
    private void attackHero(final Hero h) {
        h.decreaseHP(a1.getBaseDamage(h));

        h.unsetOvertimes();
        h.decreaseHP(a2.getBaseDamage(h));
        h.setOvertimeDamage(a2.getOvertimeDamage());
        h.setTimeDamage(a2.getTimeDamage());

        if (h.getHP() <= 0) {
            h.killPlayer();
        }
    }
    /**
     * Pyromancer attacks a Knight.
     * @param knight: Knight to be attacked
     */
    @Override
    public final void attack(final Knight knight) {
        a1.setRaceAmplifier(Constants.PYRO_ATTACKS_KNIGHT_AMPLIFIER_1);
        a2.setRaceAmplifier(Constants.PYRO_ATTACKS_KNIGHT_AMPLIFIER_2);
        this.setTerrainAmplifier(knight.getTerrain());

        attackHero(knight);
    }
    /**
     * Pyromancer attacks a Pyromancer.
     * @param pyro: Pyromancer to be attacked
     */
    @Override
    public final void attack(final Pyromancer pyro) {
        a1.setRaceAmplifier(Constants.PYRO_ATTACKS_PYRO_AMPLIFIER_1);
        a2.setRaceAmplifier(Constants.PYRO_ATTACKS_PYRO_AMPLIFIER_2);
        this.setTerrainAmplifier(pyro.getTerrain());

        attackHero(pyro);
    }
    /**
     * Pyromancer attacks a Rogue.
     * @param rogue: Rogue to be attacked
     */
    @Override
    public final void attack(final Rogue rogue) {
        a1.setRaceAmplifier(Constants.PYRO_ATTACKS_ROGUE_AMPLIFIER_1);
        a2.setRaceAmplifier(Constants.PYRO_ATTACKS_ROGUE_AMPLIFIER_2);
        this.setTerrainAmplifier(rogue.getTerrain());

        attackHero(rogue);
    }
    /**
     * Pyromancer attacks a Wizard.
     * @param wiz: Wizard to be attacked
     */
    @Override
    public final void attack(final Wizard wiz) {
        a1.setRaceAmplifier(Constants.PYRO_ATTACKS_WIZ_AMPLIFIER_1);
        a2.setRaceAmplifier(Constants.PYRO_ATTACKS_WIZ_AMPLIFIER_2);
        this.setTerrainAmplifier(wiz.getTerrain());

        wiz.setPrevHP();
        attackHero(wiz);
    }

    /**
     * Pyromancer has interaction with an Angel.
     * @param angel Angel that interacts with Pyromancer
     */
    @Override
    public void isHelpedBy(final Angel angel) {
        angel.help(this);
    }

    /**
     * Applying a specific strategy according to Pyromancer's HP.
     */
    @Override
    public void setStrategy() {
        if (this.getHP() >= this.getFullHp() * Constants.THIRD || this.isParalized()) {
            strategy = new BasicStrategy();
        } else if (this.getFullHp() * Constants.QUARTER < this.getHP()
                    && this.getHP() < this.getFullHp() * Constants.THIRD) {
            strategy = new PyromancerAggressive();
            strategy.applyStrategy(this);
        } else if (this.getHP() < this.getFullHp() * Constants.QUARTER && 0 < this.getHP()) {
            strategy = new PyromancerPassive();
            strategy.applyStrategy(this);
        }

    }
    @Override
    public final String getName() {
        return "Pyromancer";
    }

}
