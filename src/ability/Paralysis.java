package ability;

import common.Constants;
import hero.Hero;
import map.TerrainList;

public class Paralysis extends OvertimeAbility {

    public Paralysis() {
        super();
        damage = Constants.PARALYSIS_DAMAGE;
        bonusDamage = Constants.PARALYSIS_BONUS_DAMAGE;
        overtimeDamage = Constants.PARALYSIS_OVERTIME_DAMAGE;
        overtimeBonus = Constants.PARALYSIS_BONUS_OVERTIME;
        paralizedRounds = Constants.PARALYSIS_ROUNDS_OVERTIME;
    }
    @Override
    public final int getParalizedRounds(final Hero h) {
        if (h.getTerrain() == TerrainList.WOODS) {
            return Constants.PARALYSIS_BONUS_ROUNDS_OVERTIME;
        }
        return paralizedRounds;
    }
}
