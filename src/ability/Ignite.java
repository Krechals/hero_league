package ability;

import common.Constants;

class Ignite extends OvertimeAbility {

    Ignite() {
        super();
        damage = Constants.IGNITE_DAMAGE;
        bonusDamage = Constants.IGNITE_BONUS_DAMAGE;
        overtimeDamage = Constants.IGNITE_OVERTIME_DAMAGE;
        overtimeBonus = Constants.IGNITE_BONUS_OVERTIME;
        timeDamage = Constants.IGNITE_ROUNDS_OVERTIME;
    }

}
