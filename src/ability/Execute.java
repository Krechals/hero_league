package ability;

import common.Constants;
import hero.Hero;

public class Execute extends DamageAbility {
    private float limitHp;
    private float bonusLimit;
    public Execute() {
        super();
        damage = Constants.EXECUTE_DAMAGE;
        bonusDamage = Constants.EXECUTE_BONUS_DAMAGE;
        limitHp = Constants.EXECUTE_LIMIT_HP;
        bonusLimit = Constants.EXECUTE_BONUS_LIMIT;
    }
    @Override
    public final int getBaseDamage(final Hero h) {
        if (Math.round(h.getFullHp() * limitHp) >= h.getHP()) {
            return h.getHP();
        }
        return Math.round(Math.round(damage * getTerrainAmplifier()) * getRaceAmplifier());
    }
    @Override
    public final int noRaceModifiersDamage(final Hero h) {
        if (Math.round(h.getFullHp() * limitHp) >= h.getPrevHP()) {
            return h.getHP();
        }
        return Math.round(damage * getTerrainAmplifier());
    }
    @Override
    public final void updateSkill(final int level) {
        super.updateSkill(level);
        limitHp = limitHp + bonusLimit;
        if (limitHp > Constants.EXECUTE_MAX_LIMIT) {
            limitHp = Constants.EXECUTE_MAX_LIMIT;
        }
    }
}
