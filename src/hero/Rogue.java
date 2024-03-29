package hero;

import ability.AbilityFactory;
import ability.AbilityList;
import angel.Angel;
import common.Constants;
import map.TerrainList;
import strategy.BasicStrategy;
import strategy.RogueAggressive;
import strategy.RoguePassive;

public class Rogue extends Hero {
    public Rogue(final int id, final int x, final int y) {
        super(Constants.ROGUE_HP, Constants.ROGUE_BONUS_HP, id, x, y);
        initial = 'R';
        a1 = AbilityFactory.getInstance().createAbility(AbilityList.BACKSTAB);
        a2 = AbilityFactory.getInstance().createAbility(AbilityList.PARALYSIS);
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
        if (terrain == TerrainList.WOODS) {
            a1.setTerrainAmplifier(Constants.ROGUE_LAND_AMPLIFIER);
            a2.setTerrainAmplifier(Constants.ROGUE_LAND_AMPLIFIER);
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
        h.setTimeDamage(a2.getParalyzedRounds(h));
        h.setParalizedRounds(a2.getParalyzedRounds(h));

        if (h.getHP() <= 0) {
            h.killPlayer();
        }
    }
    /**
     * Rogue attacks a Knight.
     * @param knight: Knight to be attacked
     */
    @Override
    public final void attack(final Knight knight) {
        a1.setRaceAmplifier(Constants.ROGUE_ATTACKS_KNIGHT_AMPLIFIER_1);
        a2.setRaceAmplifier(Constants.ROGUE_ATTACKS_KNIGHT_AMPLIFIER_2);
        this.setTerrainAmplifier(knight.getTerrain());

        attackHero(knight);
    }
    /**
     * Rogue attacks a Pyromancer.
     * @param pyro: Pyromancer to be attacked
     */
    @Override
    public final void attack(final Pyromancer pyro) {
        a1.setRaceAmplifier(Constants.ROGUE_ATTACKS_PYRO_AMPLIFIER_1);
        a2.setRaceAmplifier(Constants.ROGUE_ATTACKS_PYRO_AMPLIFIER_2);
        this.setTerrainAmplifier(pyro.getTerrain());

        attackHero(pyro);
    }
    /**
     * Rogue attacks a Rogue.
     * @param rogue: Rogue to be attacked
     */
    @Override
    public final void attack(final Rogue rogue) {
        a1.setRaceAmplifier(Constants.ROGUE_ATTACKS_ROGUE_AMPLIFIER_1);
        a2.setRaceAmplifier(Constants.ROGUE_ATTACKS_ROGUE_AMPLIFIER_2);
        this.setTerrainAmplifier(rogue.getTerrain());

        attackHero(rogue);
    }
    /**
     * Rogue attacks a Wizard.
     * @param wiz: Wizard to be attacked
     */
    @Override
    public final void attack(final Wizard wiz) {
        a1.setRaceAmplifier(Constants.ROGUE_ATTACKS_WIZ_AMPLIFIER_1);
        a2.setRaceAmplifier(Constants.ROGUE_ATTACKS_WIZ_AMPLIFIER_2);
        this.setTerrainAmplifier(wiz.getTerrain());

        wiz.setPrevHP();
        attackHero(wiz);
    }

    /**
     * Rogue has interaction with an Angel.
     * @param angel Angel that interacts with Knight
     */
    @Override
    public void isHelpedBy(final Angel angel) {
        angel.help(this);
    }

    /**
     * Applying a specific strategy according to Rogue's HP.
     */
    @Override
    public void setStrategy() {
        if (this.getHP() >= this.getFullHp() * Constants.FIFTH || this.isParalized()) {
            strategy = new BasicStrategy();
        } else if (this.getFullHp() * Constants.SEVENTH < this.getHP()
                    && this.getHP() < this.getFullHp() * Constants.FIFTH) {
            strategy = new RogueAggressive();
            strategy.applyStrategy(this);
        } else if (this.getHP() < this.getFullHp() * Constants.SEVENTH && 0 < this.getHP()) {
            strategy = new RoguePassive();
            strategy.applyStrategy(this);
        }
    }
    @Override
    public final String getName() {
        return "Rogue";
    }
}
