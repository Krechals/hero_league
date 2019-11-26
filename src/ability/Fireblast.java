package ability;

import map.TerrainList;

public class Fireblast extends Ability{

    public Fireblast() {
        super();
        damage = 350;
        bonusDamage = 50;
    }
    public void updateDamage(int level) {
        damage += level * bonusDamage;
    }
    public void setTerrainAmplifier(TerrainList terrain) {
        if (terrain == TerrainList.VOLCANIC) {
            terrainAmplifier = 1.25f;
        } else {
            terrainAmplifier = 1;
        }
    }
}
