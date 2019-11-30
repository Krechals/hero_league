package hero;


import ability.Fireblast;
import ability.Ignite;
import map.TerrainList;

public class Pyromancer extends Hero {
    public Pyromancer(int id, int x, int y) {
        super(id, 500,50, x, y);
        initial = 'P';
        a1 = new Fireblast();
        a2 = new Ignite();
    }
    @Override
    public void isAttackedBy(Hero hero, TerrainList terrain) {
        if (terrain == TerrainList.VOLCANIC) {
            hero.a1.setTerrainAmplifier(1.25f);
            hero.a2.setTerrainAmplifier(1.25f);
        } else {
            hero.a1.setTerrainAmplifier(1f);
            hero.a2.setTerrainAmplifier(1f);
        }
        hero.attack(this, terrain);
    }
    @Override
    public void attack(Knight knight, TerrainList terrain) {
        a1.setRaceAmplifier(1.20f);
        a2.setRaceAmplifier(1.20f);

        knight.decreaseHP(a1.getBaseDamage());
        knight.setOvertimeDamage(a1.getOvertimeDamage());
        knight.setTimeDamage(a2.getTimeDamage());

        knight.unsetOvertimes();
        knight.decreaseHP(a2.getBaseDamage());
        knight.setOvertimeDamage(a2.getOvertimeDamage());
        knight.setTimeDamage(a2.getTimeDamage());

        if (knight.getHP() <= 0) {
            knight.killPlayer();
        }
    }
    @Override
    public void attack(Pyromancer pyro, TerrainList terrain) {
        a1.setRaceAmplifier(0.90f);
        a2.setRaceAmplifier(0.90f);

        pyro.decreaseHP(a1.getBaseDamage());
        pyro.setOvertimeDamage(a1.getOvertimeDamage());
        pyro.setTimeDamage(a1.getTimeDamage());

        pyro.unsetOvertimes();
        pyro.decreaseHP(a2.getBaseDamage());
        pyro.setOvertimeDamage(a2.getOvertimeDamage());
        pyro.setTimeDamage(a2.getTimeDamage());

        if (pyro.getHP() <= 0) {
            pyro.killPlayer();
        }
    }
    @Override
    public void attack(Rogue rogue, TerrainList terrain) {
        a1.setRaceAmplifier(0.80f);
        a2.setRaceAmplifier(0.80f);

        rogue.decreaseHP(a1.getBaseDamage());
        rogue.setOvertimeDamage(a1.getOvertimeDamage());
        rogue.setTimeDamage(a1.getTimeDamage());

        rogue.unsetOvertimes();
        rogue.decreaseHP(a2.getBaseDamage());
        rogue.setOvertimeDamage(a2.getOvertimeDamage());
        rogue.setTimeDamage(a2.getTimeDamage());

        if (rogue.getHP() <= 0) {
            rogue.killPlayer();
        }
    }
    @Override
    public void attack(Wizard wiz, TerrainList terrain) {
        a1.setRaceAmplifier(0.95f);
        a2.setRaceAmplifier(0.95f);

        wiz.decreaseHP(a1.getBaseDamage());
        wiz.setOvertimeDamage(a1.getOvertimeDamage());
        wiz.setTimeDamage(a1.getTimeDamage());

        wiz.unsetOvertimes();
        wiz.decreaseHP(a2.getBaseDamage());
        wiz.setOvertimeDamage(a2.getOvertimeDamage());
        wiz.setTimeDamage(a2.getTimeDamage());

        if (wiz.getHP() <= 0) {
            wiz.killPlayer();
        }
    }

}
