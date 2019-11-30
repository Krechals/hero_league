package hero;

import ability.Ability;
import ability.Execute;
import ability.Slam;
import map.TerrainList;

public class Knight extends Hero {
    public Knight(int id, int x, int y) {
        super(id, 900,80, x, y);
        initial = 'K';
        a1 = new Execute();
        a2 = new Slam();
    }
    @Override
    public void isAttackedBy(Hero hero, TerrainList terrain) {
        hero.attack(this, terrain);
    }
    private void setTerrainAmplifier(TerrainList terrain) {
        if (terrain == TerrainList.LAND) {
            a1.setTerrainAmplifier(1.15f);
            a2.setTerrainAmplifier(1.15f);
        } else {
            a1.setTerrainAmplifier(1f);
            a2.setTerrainAmplifier(1f);
        }
    }
    @Override
    public void attack(Knight knight, TerrainList terrain) {
        a1.setRaceAmplifier(1f);
        a2.setRaceAmplifier(1.20f);
        this.setTerrainAmplifier(terrain);

        knight.decreaseHP(a1.getBaseDamage(knight));

        knight.unsetOvertimes();
        knight.decreaseHP(a2.getBaseDamage());
        knight.setParalizedRounds(a2.getParalizedRounds());

        if (knight.getHP() <= 0) {
            knight.killPlayer();
        }
    }
    @Override
    public void attack(Pyromancer pyro, TerrainList terrain) {
        a1.setRaceAmplifier(1.10f);
        a2.setRaceAmplifier(0.90f);
        this.setTerrainAmplifier(terrain);

        pyro.decreaseHP(a1.getBaseDamage(pyro));

        pyro.unsetOvertimes();
        pyro.decreaseHP(a2.getBaseDamage());
        pyro.setParalizedRounds(a2.getParalizedRounds());

        if (pyro.getHP() <= 0) {
            pyro.killPlayer();
        }
    }
    @Override
    public void attack(Rogue rogue, TerrainList terrain) {
        a1.setRaceAmplifier(1.15f);
        a2.setRaceAmplifier(0.80f);
        this.setTerrainAmplifier(terrain);

        rogue.decreaseHP(a1.getBaseDamage(rogue));

        rogue.unsetOvertimes();
        rogue.decreaseHP(a2.getBaseDamage());
        rogue.setParalizedRounds(a2.getParalizedRounds());

        if (rogue.getHP() <= 0) {
            rogue.killPlayer();
        }
    }
    @Override
    public void attack(Wizard wiz, TerrainList terrain) {
        a1.setRaceAmplifier(0.80f);
        a2.setRaceAmplifier(1.05f);
        this.setTerrainAmplifier(terrain);

        wiz.setPrevHP();
        wiz.decreaseHP(a1.getBaseDamage(wiz));

        wiz.unsetOvertimes();
        wiz.decreaseHP(a2.getBaseDamage());
        wiz.setParalizedRounds(a2.getParalizedRounds());

        if (wiz.getHP() <= 0) {
            wiz.killPlayer();
        }
    }
}
