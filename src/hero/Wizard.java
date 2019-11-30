package hero;

import ability.Deflect;
import ability.Drain;
import map.TerrainList;

public class Wizard extends Hero{
    private int prevHP;
    public Wizard(int id, int x, int y) {
        super(id, 400,30, x, y);
        initial = 'W';
        prevHP = 400;
        a1 = new Drain();
        a2 = new Deflect();
    }
    public void setPrevHP() {
        prevHP = this.getHP();
    }
    public int getPrevHP() {
        return prevHP;
    }
    @Override
    public void isAttackedBy(Hero hero, TerrainList terrain) {
        hero.attack(this, terrain);
    }
    private void setTerrainAmplifier(TerrainList terrain) {
        if (terrain == TerrainList.DESERT) {
            a1.setTerrainAmplifier(1.10f);
            a2.setTerrainAmplifier(1.10f);
        } else {
            a1.setTerrainAmplifier(1f);
            a2.setTerrainAmplifier(1f);
        }
    }
    @Override
    public void attack(Knight knight, TerrainList terrain) {
        a1.setRaceAmplifier(1.20f);
        a2.setRaceAmplifier(1.40f);
        this.setTerrainAmplifier(terrain);

        knight.decreaseHP(a1.getBaseDamage(knight));
        knight.decreaseHP(a2.getBaseDamage(knight, this));
        if (knight.getHP() <= 0) {
            knight.killPlayer();
        }
    }
    @Override
    public void attack(Pyromancer pyro, TerrainList terrain) {
        a1.setRaceAmplifier(0.90f);
        a2.setRaceAmplifier(1.30f);
        this.setTerrainAmplifier(terrain);

        pyro.decreaseHP(a1.getBaseDamage(pyro));
        pyro.decreaseHP(a2.getBaseDamage(pyro, this));
        if (pyro.getHP() <= 0) {
            pyro.killPlayer();
        }
    }
    @Override
    public void attack(Rogue rogue, TerrainList terrain) {
        a1.setRaceAmplifier(0.80f);
        a2.setRaceAmplifier(1.20f);
        this.setTerrainAmplifier(terrain);

        rogue.decreaseHP(a1.getBaseDamage(rogue));
        rogue.decreaseHP(a2.getBaseDamage(rogue, this));
        if (rogue.getHP() <= 0) {
            rogue.killPlayer();
        }
    }
    @Override
    public void attack(Wizard wiz, TerrainList terrain) {
        a1.setRaceAmplifier(1.05f);
        this.setTerrainAmplifier(terrain);

        wiz.setPrevHP();
        wiz.decreaseHP(a1.getBaseDamage(wiz));
        if (wiz.getHP() <= 0) {
            wiz.killPlayer();
        }
    }
}
