package hero;

import map.TerrainList;

public class Knight extends Hero {
    // Ability a1;
    // Ability a2;
    public Knight(int id, int x, int y) {
        super(id, 900,80, x, y);
        initial = 'K';
    }
    @Override
    public void isAttackedBy(Hero hero, TerrainList terrain) {
        hero.attack(this, terrain);
    }
    @Override
    public void attack(Knight knight, TerrainList terrain) {

    }
    @Override
    public void attack(Pyromancer pyro, TerrainList terrain) {

    }
    @Override
    public void attack(Rogue rogue, TerrainList terrain) {
    }
    @Override
    public void attack(Wizard wiz, TerrainList terrain) {

    }
}
