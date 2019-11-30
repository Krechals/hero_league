package ability;

import hero.Hero;
import map.TerrainList;

public class Ability {
    protected float terrainAmplifier;
    protected float raceAmplifier;
    protected int damage;
    protected int bonusDamage;
    protected int overtimeDamage;
    protected int overtimeBonus;
    protected int timeDamage ;
    protected int cooldown;
    protected int paralizedRounds;

    public Ability() {
        terrainAmplifier = 1;
        raceAmplifier = 1;
        cooldown = 0;
        damage = 0;
        overtimeDamage = 0;
        timeDamage = 0;
        paralizedRounds = 0;
    }
    public void setRaceAmplifier(float amplifier) {
        raceAmplifier = amplifier;
    }
    public void setTerrainAmplifier(float amplifier) {
        terrainAmplifier = amplifier;
    }
    public int getBaseDamage() {
        return Math.round(damage * terrainAmplifier * raceAmplifier);
    }
    public int noRaceModifiersDamage() {
        return Math.round(damage * terrainAmplifier);
    }
    public int noRaceModifiersDamage(Hero h) {
        // implemented in sublcass
        return 0;
    }
    public int noRaceModifiersDamage(TerrainList terrain) {
        // implemented in subclass
        return 0;
    }
    public int getBaseDamage(Hero h) {
        // implemented in subclass
        return 0;
    }
    public int getBaseDamage(Hero h, Hero wiz) {
        // implemented int subclass
        return 0;
    }
    public int getBaseDamage(TerrainList terrain) {
        // implemented in subclass
        return 0;
    }
    public int getParalizedRounds(TerrainList terrain) {
        // implemented in subclass
        return 0;
    }
    public int getOvertimeDamage() {
        return Math.round(overtimeDamage * terrainAmplifier * raceAmplifier);
    }
    public int getTimeDamage() {
        return timeDamage;
    }
    public int getParalizedRounds() {
        return paralizedRounds;
    }
    public void updateSkill(int level) {
        damage = damage + level * bonusDamage;
    }

}
