package ability;

import map.TerrainList;

public class Paralysis extends Ability {

    public Paralysis() {
        super();
        damage = 40;
        bonusDamage = 10;
        overtimeDamage = 40;
        overtimeBonus = 10;
        paralizedRounds = 3;
    }
    public int getParalizedRounds(TerrainList terrain) {
        if (terrain == TerrainList.WOODS) {
            return paralizedRounds + 3;
        }
        return paralizedRounds;
    }
}
