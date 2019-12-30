package ability;

import common.Constants;
import hero.Hero;

public class Drain extends DamageAbility {

    private float percent;
    private float bonusPercent;
    public Drain() {
        super();
        percent = Constants.DRAIN_PERCENT;
        bonusPercent = Constants.DRAIN_BONUS_PERCENT;
    }
    @Override
    public final int getBaseDamage(final Hero h) {
        int totalDamage = Math.min(Math.round(Constants.DRAIN_FORMULA_PERCENT
                                    * h.getFullHp()), h.getHP());
        return Math.round(percent *  totalDamage * getRaceAmplifier() * getTerrainAmplifier());
    }
    @Override
    public final void updateSkill(final int level) {
        percent += bonusPercent;
    }
}
