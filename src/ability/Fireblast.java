package ability;

import common.Constants;

class Fireblast extends DamageAbility {

    Fireblast() {
        super();
        damage = Constants.FIREBLAST_DAMAGE;
        bonusDamage = Constants.FIREBLAST_BONUS_DAMAGE;
    }
}
