package ability;

import map.TerrainList;

public class Ignite extends Ability{

    public Ignite() {
        super();
        damage = 150;
        bonusDamage = 20;
        overtimeDamage = 50;
        overtimeBonus = 30;
        timeDamage = 2;
    }
    public void updateDamage(int level) {
        damage += level * bonusDamage;
        overtimeDamage += level * overtimeBonus;
    }
    public void setTerrainAmplifier(TerrainList terrain) {
        if (terrain == TerrainList.VOLCANIC) {
            terrainAmplifier = 1.25f;
        } else {
            terrainAmplifier = 1;
        }
    }

}
