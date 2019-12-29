package ability;

import common.Constants;
import hero.Hero;

public class Deflect extends DamageAbility {
    private float percent;
    private float bonusPercent;
    public Deflect() {
        super();
        percent = Constants.DEFLECT_PERCENT;
        bonusPercent = Constants.DEFLECT_BONUS_PERCENT;
    }
    @Override
    public final int getBaseDamage(final Hero h, final Hero wiz) {
        if (h.getInitial() == 'W') {
            return 0;
        }
        int totalDamage = Math.round(h.getAbility1().noRaceModifiersDamage(wiz)
                                    + h.getAbility2().noRaceModifiersDamage(wiz));
        return Math.round(Math.round(percent * totalDamage)
                                    * getRaceAmplifier() * getTerrainAmplifier());
    }
    @Override
    public final void updateSkill(final int level) {
        super.updateSkill(level);
        percent = percent + bonusPercent;
        if (percent > Constants.DEFLECT_MAX_PERCENT) {
            percent = Constants.DEFLECT_MAX_PERCENT;
        }
    }
}
