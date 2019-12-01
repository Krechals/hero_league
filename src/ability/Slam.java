package ability;

import common.Constants;

public class Slam extends OvertimeAbility {

    public Slam() {
        super();
        damage = Constants.SLAM_DAMAGE;
        bonusDamage = Constants.SLAM_BONUS_DAMAGE;
        paralizedRounds = Constants.SLAM_ROUNDS_OVERTIME;
    }

}
