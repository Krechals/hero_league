package angel;

import engine.DataRepository;
import hero.Knight;
import hero.Pyromancer;
import hero.Rogue;
import hero.Wizard;
import logs.DataAngelKill;
import logs.DataHit;
import logs.DataKill;

public class TheDoomer extends Angel {
    public TheDoomer(int x, int y) {
        super(x, y);
    }
    @Override
    public void help(Knight knight) {
        if (knight.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            knight.dead();
            dataRepository.addData(new DataHit(this, knight));
            dataRepository.addData(new DataAngelKill(knight));
        }
    }
    @Override
    public void help(Pyromancer pyro) {
        if (pyro.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            pyro.dead();
            dataRepository.addData(new DataHit(this, pyro));
            dataRepository.addData(new DataAngelKill(pyro));
        }
    }
    @Override
    public void help(Rogue rogue) {
        if (rogue.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            rogue.dead();
            dataRepository.addData(new DataHit(this, rogue));
            dataRepository.addData(new DataAngelKill(rogue));
        }
    }
    @Override
    public void help(Wizard wiz) {
        if (wiz.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            wiz.dead();
            dataRepository.addData(new DataHit(this, wiz));
            dataRepository.addData(new DataAngelKill(wiz));
        }
    }
    @Override
    public String getName() {
        return "TheDoomer";
    }
}
