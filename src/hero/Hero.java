package hero;

public abstract class Hero {
    private int id;
    private int hp;
    private int bonusHp;
    private int xp;
    private int level;
    private int xLocation;
    private int yLocation;

    public Hero(int id, int hp, int bonusHp, int x, int y) {
        this.id = id;
        this.hp = hp;
        this.bonusHp = bonusHp;
        this.xp = 0;
        this.level = 0;
        this.xLocation = x;
        this.yLocation = y;
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
}
