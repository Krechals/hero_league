package hero;

import angel.Angel;
import logs.DataLevelUp;
import ability.Ability;
import common.Constants;
import engine.DataRepository;
import map.TerrainList;
import strategy.AttackStrategy;

public abstract class Hero {
    private int id;
    private int fullHp;
    private int initialHp;
    private int hp;
    private int bonusHp;
    private int xp;
    private int level;
    private int xLocation;
    private int yLocation;
    private int overtimeDamaged;
    private int timeDamage;
    private boolean isAlive;
    private int paralizedRounds;
    private float angelBonus;
    protected char initial;
    protected Ability a1;
    protected Ability a2;
    protected AttackStrategy strategy;
    private TerrainList terrain;

    public Hero(final int hp, final int bonusHp, final int id, final int x, final int y) {
        this.id = id;
        this.hp = hp;
        this.fullHp = hp;
        this.initialHp = hp;
        this.bonusHp = bonusHp;
        this.xp = 0;
        this.level = 0;
        this.xLocation = x;
        this.yLocation = y;
        this.overtimeDamaged = 0;
        this.timeDamage = 0;
        this.isAlive = true;
        this.terrain = null;
        this.angelBonus = 0;
    }
    /**
     * Moves a player on the map.
     * @param operation: Move direction (up, down, left, right)
     */
    public final void move(final char operation) {
        switch (operation) {
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
            default:
                return;
        }
    }

    /**
     * Implemented in Wizard class.
     * @return Hero's HP before taking damage
     */
    public int getPrevHP() {
        // implemented in subclass
        return 0;
    }

    /**
     * Gives XP to current hero when winning a round.
     * @param looserLevel: Defended hero level
     */
    public final void setXP(final int looserLevel) {
        xp = xp + Math.max(0, Constants.HERO_XP_FORMULA - (level - looserLevel)
                * Constants.HERO_XP_MULTIPLIER);
        this.updateLevel();
    }
    public final void addXP(final int addedXP) {
        this.xp += addedXP;
    }
    public final Ability getAbility1() {
        return a1;
    }
    public final Ability getAbility2() {
        return a2;
    }
    public final int getxLocation() {
        return xLocation;
    }
    public final int getyLocation() {
        return yLocation;
    }
    public final void decreaseHP(final int damage) {
        this.hp -= damage;
    }

    public final void setHP(final int newHP) {
        this.hp = newHP;
        if (this.hp > fullHp) {
            this.hp = fullHp;
        }
    }

    public final void revive() {
        isAlive = true;
    }
    public final void dead() {
        isAlive = false;
    }

    /**
     * Adds Angel Bonus to both hero's abilities.
     * @param bonus Percent to be added to abilities
     */
    public final void addAngelBonus(final float bonus) {
        angelBonus += bonus;
        a1.setAngelBonus(angelBonus);
        a2.setAngelBonus(angelBonus);
    }
    final void setOvertimeDamage(final int damage) {
        overtimeDamaged = damage;
    }
    final void setTimeDamage(final int time) {
        timeDamage = time;
    }
    public final void overtimeDamage() {
        if (timeDamage > 0) {
            --timeDamage;
            hp -= overtimeDamaged;
            if (hp <= 0) {
                this.killPlayer();
            }
        }
    }
    public final void setTerrain(final TerrainList mapTerrain) {
        terrain = mapTerrain;
    }
    public final TerrainList getTerrain() {
        return terrain;
    }
    public final int getHP() {
        return hp;
    }
    public final int getID() {
        return id;
    }
    public final char getInitial() {
        return initial;
    }
    public final int getLevel() {
        return level;
    }
    public final int getXP() {
        return xp;
    }
    public final boolean isAlive() {
        return this.isAlive;
    }
    final void killPlayer() {
        isAlive = false;
    }
    public final int getFullHp() {
        return fullHp;
    }
    public final boolean isParalized() {
        return paralizedRounds > 0;
    }
    public final void decreaseParalizedTime() {
        if (paralizedRounds > 0) {
            --paralizedRounds;
        }
    }
    final void setParalizedRounds(final int rounds) {
        paralizedRounds = rounds;
    }
    // Checks and updates Hero's level if needed
    public final void updateLevel() {
        int newLevel = (xp - Constants.HERO_FIRST_LEVEL) / Constants.HERO_LEVEL_UP;
        if (newLevel > level) {
            DataRepository dataRepository = DataRepository.getInstance();
            for (int lvl = level + 1; lvl <= newLevel; ++lvl) {
                level = lvl;
                a1.updateSkill(level);
                a2.updateSkill(level);
                dataRepository.addData(new DataLevelUp(this));
            }
            level = newLevel;
            hp = initialHp + newLevel * bonusHp;
            fullHp = hp;
        }
    }
    public final void levelUP() {
        this.xp = Constants.HERO_FIRST_LEVEL + (this.level + 1) * Constants.HERO_LEVEL_UP;
        this.updateLevel();
    }
    final void unsetOvertimes() {
        paralizedRounds = 0;
        overtimeDamaged = 0;
        timeDamage = 0;
    }
    // Visitor Design Pattern - Hero vs Hero attacks
    public abstract void isAttackedBy(Hero hero);
    abstract void attack(Knight knight);
    abstract void attack(Pyromancer pyro);
    abstract void attack(Rogue rogue);
    abstract void attack(Wizard wiz);

    // Visitor Design Pattern - Receive Angel Bonus
    public abstract void isHelpedBy(Angel angel);
    // Strategy Design Pattern - Attacking strategy
    public abstract void setStrategy();
    // Hero's name
    public abstract String getName();
}
