package hero;

import ability.Backstab;
import ability.Paralysis;
import map.TerrainList;

public class Rogue extends Hero {
    public Rogue(int id, int x, int y) {
        super(id, 600,40, x, y);
        initial = 'R';
        a1 = new Backstab();
        a2 = new Paralysis();
    }
    @Override
    public void isAttackedBy(Hero hero, TerrainList terrain) {
        hero.attack(this, terrain);
    }
    private void setTerrainAmplifier(TerrainList terrain) {
        if (terrain == TerrainList.WOODS) {
            a1.setTerrainAmplifier(1.15f);
            a2.setTerrainAmplifier(1.15f);
        } else {
            a1.setTerrainAmplifier(1f);
            a2.setTerrainAmplifier(1f);
        }
    }
    @Override
    public void attack(Knight knight, TerrainList terrain) {
        a1.setRaceAmplifier(0.90f);
        a2.setRaceAmplifier(0.80f);
        this.setTerrainAmplifier(terrain);

        knight.decreaseHP(a1.getBaseDamage(terrain));

        knight.unsetOvertimes();
        knight.decreaseHP(a2.getBaseDamage());
        knight.setOvertimeDamage(a2.getOvertimeDamage());
        knight.setTimeDamage(a2.getParalizedRounds(terrain));
        knight.setParalizedRounds(a2.getParalizedRounds(terrain));

        if (knight.getHP() <= 0) {
            knight.killPlayer();
        }
    }
    @Override
    public void attack(Pyromancer pyro, TerrainList terrain) {
        a1.setRaceAmplifier(1.25f);
        a2.setRaceAmplifier(1.20f);
        this.setTerrainAmplifier(terrain);

        pyro.decreaseHP(a1.getBaseDamage(terrain));

        pyro.unsetOvertimes();
        pyro.decreaseHP(a2.getBaseDamage());
        pyro.setOvertimeDamage(a2.getOvertimeDamage());
        pyro.setTimeDamage(a2.getParalizedRounds(terrain));
        pyro.setParalizedRounds(a2.getParalizedRounds(terrain));

        if (pyro.getHP() <= 0) {
            pyro.killPlayer();
        }
    }
    @Override
    public void attack(Rogue rogue, TerrainList terrain) {
        a1.setRaceAmplifier(1.20f);
        a2.setRaceAmplifier(0.90f);
        this.setTerrainAmplifier(terrain);

        rogue.decreaseHP(a1.getBaseDamage(terrain));

        rogue.unsetOvertimes();
        rogue.decreaseHP(a2.getBaseDamage());
        rogue.setOvertimeDamage(a2.getOvertimeDamage());
        rogue.setTimeDamage(a2.getParalizedRounds(terrain));
        rogue.setParalizedRounds(a2.getParalizedRounds(terrain));

        if (rogue.getHP() <= 0) {
            rogue.killPlayer();
        }
    }
    @Override
    public void attack(Wizard wiz, TerrainList terrain) {
        a1.setRaceAmplifier(1.25f);
        a2.setRaceAmplifier(1.25f);
        this.setTerrainAmplifier(terrain);

        wiz.setPrevHP();
        wiz.decreaseHP(a1.getBaseDamage(terrain));

        wiz.unsetOvertimes();
        wiz.decreaseHP(a2.getBaseDamage());
        wiz.setOvertimeDamage(a2.getOvertimeDamage());
        wiz.setTimeDamage(a2.getParalizedRounds(terrain));
        wiz.setParalizedRounds(a2.getParalizedRounds(terrain));

        if (wiz.getHP() <= 0) {
            wiz.killPlayer();
        }
    }
}
