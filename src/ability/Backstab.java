package ability;

import map.TerrainList;

public class Backstab extends Ability{
    private float critical;
    private float noAttacks;
    public Backstab() {
        super();
        damage = 200;
        bonusDamage = 20;
        critical = 1.5f;
        noAttacks = 0;
    }

    public int getBaseDamage(TerrainList terrain) {
        if ((noAttacks == 0 || noAttacks % 3 == 0) && (terrain == TerrainList.WOODS)) {
            ++noAttacks;
            return Math.round(super.getBaseDamage() * critical);
        }
        ++noAttacks;
        return super.getBaseDamage();
    }
    public int noRaceModifiersDamage(TerrainList terrain) {
        if (((noAttacks - 1) == 0 || (noAttacks - 1) % 3 == 0) && (terrain == TerrainList.WOODS)) {
            return Math.round(damage * critical * terrainAmplifier);
        }
        return Math.round(damage * terrainAmplifier);
    }
}
