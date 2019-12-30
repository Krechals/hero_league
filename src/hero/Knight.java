package hero;

import ability.AbilityFactory;
import ability.AbilityList;
import angel.Angel;
import common.Constants;
import map.TerrainList;
import strategy.BasicStrategy;
import strategy.KnightAggressive;
import strategy.KnightPassive;

public class Knight extends Hero {
    public Knight(final int id, final int x, final int y) {
        super(Constants.KNIGHT_HP, Constants.KNIGHT_BONUS_HP, id, x, y);
        initial = 'K';
        a1 = AbilityFactory.getInstance().createAbility(AbilityList.EXECUTE);
        a2 = AbilityFactory.getInstance().createAbility(AbilityList.SLAM);
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
        if (terrain == TerrainList.LAND) {
            a1.setTerrainAmplifier(Constants.KNIGHT_LAND_AMPLIFIER);
            a2.setTerrainAmplifier(Constants.KNIGHT_LAND_AMPLIFIER);
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
        h.setParalizedRounds(a2.getParalizedRounds(h));

        if (h.getHP() <= 0) {
            h.killPlayer();
        }
    }
    /**
     * Knight attacks a Knight.
     * @param knight: Knight to be attacked
     */
    @Override
    public final void attack(final Knight knight) {
        a1.setRaceAmplifier(Constants.NO_APLIFICATION);
        a2.setRaceAmplifier(Constants.KNIGHT_ATTACKS_KNIGHT_AMPLIFIER_2);
        this.setTerrainAmplifier(knight.getTerrain());

        attackHero(knight);
    }
    /**
     * Knight attacks a Pyromancer.
     * @param pyro: Pyromancer to be attacked
     */
    @Override
    public final void attack(final Pyromancer pyro) {
        a1.setRaceAmplifier(Constants.KNIGHT_ATTACKS_PYRO_AMPLIFIER_1);
        a2.setRaceAmplifier(Constants.KNIGHT_ATTACKS_PYRO_AMPLIFIER_2);
        this.setTerrainAmplifier(pyro.getTerrain());

        attackHero(pyro);
    }
    /**
     * Knight attacks a Rogue.
     * @param rogue: Rogue to be attacked
     */
    @Override
    public final void attack(final Rogue rogue) {
        a1.setRaceAmplifier(Constants.KNIGHT_ATTACKS_ROGUE_AMPLIFIER_1);
        a2.setRaceAmplifier(Constants.KNIGHT_ATTACKS_ROGUE_AMPLIFIER_2);
        this.setTerrainAmplifier(rogue.getTerrain());

        attackHero(rogue);
    }

    /**
     * Knight attacks a Wizard.
     * @param wiz: Wizard to be attacked
     */
    @Override
    public final void attack(final Wizard wiz) {
        a1.setRaceAmplifier(Constants.KNIGHT_ATTACKS_WIZ_AMPLIFIER_1);
        a2.setRaceAmplifier(Constants.KNIGHT_ATTACKS_WIZ_AMPLIFIER_2);
        this.setTerrainAmplifier(wiz.getTerrain());

        wiz.setPrevHP();
        attackHero(wiz);
    }
    @Override
    public void isHelpedBy(Angel angel) {
        angel.help(this);
    }
    @Override
    public void setStrategy() {
        if (this.noStrategyHP >= this.getFullHp() / 2 || this.isParalized()) {
            strategy = new BasicStrategy();
        } else if (this.getFullHp() / 3 < this.getHP() && this.getHP() < this.getFullHp() / 2) {
            strategy = new KnightAggressive();
            strategy.applyStrategy(this);
        } else if (this.getHP() < this.getFullHp() / 3 && 0 < this.getHP()) {
            strategy = new KnightPassive();
            strategy.applyStrategy(this);
        }

    }
    @Override
    public final String getName() {
        return "Knight";
    }
}
