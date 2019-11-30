package hero;

import ability.Ability;
import map.TerrainList;

import java.time.chrono.ThaiBuddhistEra;

public abstract class Hero {
    private int id;
    private int fullHp;
    private int hp;
    private int bonusHp;
    private int xp;
    private int level;
    private int xLocation;
    private int yLocation;
    private int freezeTime;
    private int overtimeDamaged;
    private int timeDamage;
    private boolean isAlive;
    private int paralizedRounds;
    protected char initial;
    protected Ability a1;
    protected Ability a2;
    private TerrainList terrain;

    public Hero(int id, int hp, int bonusHp, int x, int y) {
        boolean isAlive = true;
        this.id = id;
        this.hp = hp;
        this.fullHp = hp;
        this.bonusHp = bonusHp;
        this.xp = 0;
        this.level = 0;
        this.xLocation = x;
        this.yLocation = y;
        this.freezeTime = 0;
        this.overtimeDamaged = 0;
        this.timeDamage = 0;
        this.isAlive = true;
        this.terrain = null;
    }
    public void move(char operation) {
        switch(operation) {
            case 'U':
                --xLocation;
                break;
            case 'D':
                ++xLocation;
                break;
            case 'L':
                --yLocation;
                break;
            case 'R':
                ++yLocation;
                break;
        }
    }
    public int getId() {
        return id;
    }
    public int getPrevHP() {
        // implemented in subclass
        return 0;
    }
    public Ability getAbility1() {
        return a1;
    }
    public Ability getAbility2() {
        return a2;
    }
    public int getxLocation() {
        return xLocation;
    }
    public int getyLocation() {
        return yLocation;
    }
    public void decreaseHP(int hp) {
        this.hp -= hp;
    }
    public void setOvertimeDamage(int damage) {
        overtimeDamaged = damage;
    }
    public void setTimeDamage(int time) {
        timeDamage = time;
    }
    public void overtimeDamage() {
        if (timeDamage > 0) {
            --timeDamage;
            hp -= overtimeDamaged;
            if (hp <= 0) {
                this.killPlayer();
            }
        }
    }
    public void setTerrain(TerrainList mapTerrain) {
        terrain = mapTerrain;
    }
    public TerrainList getTerrain() {
        return terrain;
    }
    public int getHP() {
        return hp;
    }
    public char getInitial() {
        return initial;
    }
    public int getLevel() {
        return level;
    }
    public int getXP() {
        return xp;
    }
    public boolean isAlive() {
        return this.isAlive;
    }
    public void killPlayer() {
        isAlive = false;
    }
    public int getFullHp() {
        return fullHp;
    }
    public boolean isParalized() {
        return paralizedRounds > 0;
    }
    public void decreaseParalizedTime() {
        if (paralizedRounds > 0) {
            --paralizedRounds;
        }
    }
    public void setParalizedRounds(int rounds) {
        paralizedRounds = rounds;
    }
    public void updateLevel() {
        int newLevel = (xp - 200) / 50;
        if (newLevel > level) {
            level = newLevel;
            fullHp = fullHp + newLevel * bonusHp;
            hp = fullHp;
            a1.updateSkill(level);
            a2.updateSkill(level);
        }
    }
    public void setXP(int looserLevel) {
        xp = xp + Math.max(0, 200 - (level - looserLevel) * 40);
        this.updateLevel();
    }
    public void unsetOvertimes() {
        paralizedRounds = 0;
        overtimeDamaged = 0;
        timeDamage = 0;
    }
    public abstract void isAttackedBy(Hero hero, TerrainList terrain);
    abstract void attack(Knight knight, TerrainList terrain);
    abstract void attack(Pyromancer pyro, TerrainList terrain);
    abstract void attack(Rogue rogue, TerrainList terrain);
    abstract void attack(Wizard wiz, TerrainList terrain);
}
