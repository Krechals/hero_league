package hero;

import ability.Ability;
import map.TerrainList;

public abstract class Hero {
    private int id;
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
    protected char initial;
    Ability a1;
    Ability a2;

    public Hero(int id, int hp, int bonusHp, int x, int y) {
        boolean isAlive = true;
        this.id = id;
        this.hp = hp;
        this.bonusHp = bonusHp;
        this.xp = 0;
        this.level = 0;
        this.xLocation = x;
        this.yLocation = y;
        this.freezeTime = 0;
        this.overtimeDamaged = 0;
        this.timeDamage = 0;
        this.isAlive = true;
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

    public abstract void isAttackedBy(Hero hero, TerrainList terrain);
    abstract void attack(Knight knight, TerrainList terrain);
    abstract void attack(Pyromancer pyro, TerrainList terrain);
    abstract void attack(Rogue rogue, TerrainList terrain);
    abstract void attack(Wizard wiz, TerrainList terrain);
}
