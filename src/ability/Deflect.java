package ability;

import hero.Hero;

public class Deflect extends Ability {
    private float percent;
    private float bonusPercent;
    public Deflect() {
        super();
        percent = 0.35f;
        bonusPercent = 0.02f;
    }
    public int getBaseDamage(Hero h, Hero wiz) {
        if (h.getInitial() == 'W') {
            return 0;
        }
        // System.out.println(h.getHP() + " " + wiz.getHP());
        int totalDamage = Math.round(h.getAbility1().noRaceModifiersDamage() + h.getAbility2().noRaceModifiersDamage());
        if (h.getInitial() == 'K') {
            totalDamage = Math.round(h.getAbility1().noRaceModifiersDamage(wiz) + h.getAbility2().noRaceModifiersDamage());
        }
        if (h.getInitial() == 'R') {
            totalDamage = Math.round(h.getAbility1().noRaceModifiersDamage(h.getTerrain()) + h.getAbility2().noRaceModifiersDamage());
        }
        return Math.round(Math.round(percent * totalDamage) * raceAmplifier * terrainAmplifier);
    }
}
