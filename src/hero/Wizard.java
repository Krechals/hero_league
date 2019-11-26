package hero;

import map.TerrainList;

public class Wizard extends Hero{
    public Wizard(int id, int x, int y) {
        super(id, 400,30, x, y);
        initial = 'W';
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
