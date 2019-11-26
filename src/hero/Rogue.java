package hero;

import map.TerrainList;

public class Rogue extends Hero {
    public Rogue(int id, int x, int y) {
        super(id, 600,40, x, y);
        initial = 'R';
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
