package angel;

import common.Constants;
import engine.DataRepository;
import hero.Knight;
import hero.Pyromancer;
import hero.Rogue;
import hero.Wizard;
import logs.DataAngelKill;
import logs.DataHit;

public class DarkAngel extends Angel {
    public DarkAngel(final int x, final int y) {
        super(x, y);
    }
    @Override
    public final void help(final Knight knight) {
        if (knight.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            // Decreases HP from Hero
            knight.decreaseHP(Constants.DARK_ANGEL_KNIGHT);
            dataRepository.addData(new DataHit(this, knight));
            // Checks if hero is still alive after being damaged
            if (knight.getHP() <= 0) {
                knight.dead();
                dataRepository.addData(new DataAngelKill(knight));
            }
        }
    }
    @Override
    public final void help(final Pyromancer pyro) {
        if (pyro.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            // Decreases HP from Hero
            pyro.decreaseHP(Constants.DARK_ANGEL_PYRO);
            dataRepository.addData(new DataHit(this, pyro));
            // Checks if hero is still alive after being damaged
            if (pyro.getHP() <= 0) {
                pyro.dead();
                dataRepository.addData(new DataAngelKill(pyro));
            }
        }
    }
    @Override
    public final void help(final Rogue rogue) {
        if (rogue.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            // Decreases HP from Hero
            rogue.decreaseHP(Constants.DARK_ANGEL_ROGUE);
            dataRepository.addData(new DataHit(this, rogue));
            // Checks if hero is still alive after being damaged
            if (rogue.getHP() <= 0) {
                rogue.dead();
                dataRepository.addData(new DataAngelKill(rogue));
            }
        }
    }
    @Override
    public final void help(final Wizard wiz) {
        if (wiz.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            // Decreases HP from Hero
            wiz.decreaseHP(Constants.DARK_ANGEL_WIZ);
            dataRepository.addData(new DataHit(this, wiz));
            // Checks if hero is still alive after being damaged
            if (wiz.getHP() <= 0) {
                wiz.dead();
                dataRepository.addData(new DataAngelKill(wiz));
            }
        }
    }
    @Override
    public final String getName() {
        return "DarkAngel";
    }
}
