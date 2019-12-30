package ability;

import common.Constants;
import hero.Hero;
import map.TerrainList;

public class Backstab extends DamageAbility {
    private float critical;
    private float noAttacks;
    public Backstab() {
        super();
        damage = Constants.BACKSTAB_DAMAGE;
        bonusDamage = Constants.BACKSTAB_BONUS_DAMAGE;
        critical = Constants.BACKSTAB_CRITICAL;
        noAttacks = 0;
    }
    @Override
    public final int getBaseDamage(final Hero h) {
        if ((noAttacks == 0 || noAttacks % Constants.BACKSTAB_CRITICAL_ROUND == 0)
                && (h.getTerrain() == TerrainList.WOODS)) {
            ++noAttacks;
            return Math.round(super.getBaseDamage(h) * critical);
        }
        ++noAttacks;
        return super.getBaseDamage(h);
    }
    @Override
    public final int noRaceModifiersDamage(final Hero h) {
        if (((noAttacks - 1) == 0 || (noAttacks - 1) % Constants.BACKSTAB_CRITICAL_ROUND == 0)
                && (h.getTerrain() == TerrainList.WOODS)) {
            return Math.round(Math.round(damage * getTerrainAmplifier()) * critical);
        }
        return Math.round(damage * getTerrainAmplifier());
    }
}
