package hero;

import ability.AbilityFactory;
import ability.AbilityList;
import common.Constants;
import map.TerrainList;

public class Rogue extends Hero {
    public Rogue(final int x, final int y) {
        super(Constants.ROGUE_HP, Constants.ROGUE_BONUS_HP, x, y);
        initial = 'R';
        a1 = AbilityFactory.getInstance().createAbility(AbilityList.BACKSTAB);
        a2 = AbilityFactory.getInstance().createAbility(AbilityList.PARALYSIS);
    }
    @Override
    public final void isAttackedBy(final Hero hero) {
        hero.attack(this);
    }
    private void setTerrainAmplifier(final TerrainList terrain) {
        if (terrain == TerrainList.WOODS) {
            a1.setTerrainAmplifier(Constants.ROGUE_LAND_AMPLIFIER);
            a2.setTerrainAmplifier(Constants.ROGUE_LAND_AMPLIFIER);
        } else {
            a1.setTerrainAmplifier(Constants.NO_APLIFICATION);
            a2.setTerrainAmplifier(Constants.NO_APLIFICATION);
        }
    }
    private void attackHero(final Hero h) {
        h.decreaseHP(a1.getBaseDamage(h));

        h.unsetOvertimes();
        h.decreaseHP(a2.getBaseDamage(h));
        h.setOvertimeDamage(a2.getOvertimeDamage());
        h.setTimeDamage(a2.getParalizedRounds(h));
        h.setParalizedRounds(a2.getParalizedRounds(h));

        if (h.getHP() <= 0) {
            h.killPlayer();
        }
    }
    @Override
    public final void attack(final Knight knight) {
        a1.setRaceAmplifier(Constants.ROGUE_ATTACKS_KNIGHT_AMPLIFIER_1);
        a2.setRaceAmplifier(Constants.ROGUE_ATTACKS_KNIGHT_AMPLIFIER_2);
        this.setTerrainAmplifier(knight.getTerrain());

        attackHero(knight);
    }
    @Override
    public final void attack(final Pyromancer pyro) {
        a1.setRaceAmplifier(Constants.ROGUE_ATTACKS_PYRO_AMPLIFIER_1);
        a2.setRaceAmplifier(Constants.ROGUE_ATTACKS_PYRO_AMPLIFIER_2);
        this.setTerrainAmplifier(pyro.getTerrain());

        attackHero(pyro);
    }
    @Override
    public final void attack(final Rogue rogue) {
        a1.setRaceAmplifier(Constants.ROGUE_ATTACKS_ROGUE_AMPLIFIER_1);
        a2.setRaceAmplifier(Constants.ROGUE_ATTACKS_ROGUE_AMPLIFIER_2);
        this.setTerrainAmplifier(rogue.getTerrain());

        attackHero(rogue);
    }
    @Override
    public final void attack(final Wizard wiz) {
        a1.setRaceAmplifier(Constants.ROGUE_ATTACKS_WIZ_AMPLIFIER_1);
        a2.setRaceAmplifier(Constants.ROGUE_ATTACKS_WIZ_AMPLIFIER_2);
        this.setTerrainAmplifier(wiz.getTerrain());

        wiz.setPrevHP();
        attackHero(wiz);
    }
}
