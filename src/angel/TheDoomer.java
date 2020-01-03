package angel;

import engine.DataRepository;
import hero.Knight;
import hero.Pyromancer;
import hero.Rogue;
import hero.Wizard;
import logs.DataAngelKill;
import logs.DataHit;

public class TheDoomer extends Angel {
    public TheDoomer(final int x, final int y) {
        super(x, y);
    }
    @Override
    public final void help(final Knight knight) {
        if (knight.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            // Kills the Hero
            knight.dead();
            dataRepository.addData(new DataHit(this, knight));
            dataRepository.addData(new DataAngelKill(knight));
        }
    }
    @Override
    public final void help(final Pyromancer pyro) {
        if (pyro.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            // Kills the Hero
            pyro.dead();
            dataRepository.addData(new DataHit(this, pyro));
            dataRepository.addData(new DataAngelKill(pyro));
        }
    }
    @Override
    public final void help(final Rogue rogue) {
        if (rogue.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            // Kills the Hero
            rogue.dead();
            dataRepository.addData(new DataHit(this, rogue));
            dataRepository.addData(new DataAngelKill(rogue));
        }
    }
    @Override
    public final void help(final Wizard wiz) {
        if (wiz.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            // Kills the Hero
            wiz.dead();
            dataRepository.addData(new DataHit(this, wiz));
            dataRepository.addData(new DataAngelKill(wiz));
        }
    }
    @Override
    public final String getName() {
        return "TheDoomer";
    }
}
