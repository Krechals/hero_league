package ability;

public class Ability {
    private float terrainAmplifier;
    private float raceAmplifier;
    private int damage;
    private int cooldown;

    public Ability() {
        terrainAmplifier = 1;
        raceAmplifier = 1;
        cooldown = 0;
        damage = 0;
    }
    public void setTerrainAmplifier(float percentage) {
        this.terrainAmplifier = percentage;
    }
    public void setRaceAmplifier(float percentage) {
        this.terrainAmplifier = percentage;
    }

}
