package ability;

import hero.Hero;

public class Execute extends Ability{
    private float limitHp;
    private float bonusLimit;
    public Execute() {
        super();
        damage = 200;
        bonusDamage = 30;
        limitHp = 0.2f;
        bonusLimit = 0.01f;
    }
    public int getBaseDamage(Hero h) {
        if (Math.round(h.getFullHp() * limitHp) >= h.getHP()) {
            return h.getHP();
        }
        return Math.round(damage * terrainAmplifier * raceAmplifier);
    }
    public int noRaceModifiersDamage(Hero h) {
        if (Math.round(h.getFullHp() * limitHp) >= h.getPrevHP()) {
            return h.getHP();
        }
        return Math.round(damage * terrainAmplifier);
    }
}
