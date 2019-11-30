package ability;

import hero.Hero;

public class Drain extends Ability {

    private float percent;
    private float bonusPercent;
    public Drain() {
        super();
        percent = 0.2f;
        bonusPercent = 0.05f;
    }
    public int getBaseDamage(Hero h) {
        int totalDamage = Math.min(Math.round(0.30f * h.getFullHp()), h.getHP());
        return Math.round(Math.round(percent *  totalDamage) * raceAmplifier * terrainAmplifier);
    }
}
