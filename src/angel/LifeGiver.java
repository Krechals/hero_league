package angel;

import engine.DataRepository;
import hero.Knight;
import hero.Pyromancer;
import hero.Rogue;
import hero.Wizard;
import logs.DataHelp;

public class LifeGiver extends Angel {
    public LifeGiver(int x, int y) {
        super(x, y);
    }
    @Override
    public void help(Knight knight) {
        if (knight.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            knight.setHP(knight.getHP() + 100);
            dataRepository.addData(new DataHelp(this, knight));
        }
    }
    @Override
    public void help(Pyromancer pyro) {
        if (pyro.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            pyro.setHP(pyro.getHP() + 80);
            dataRepository.addData(new DataHelp(this, pyro));
        }
    }
    @Override
    public void help(Rogue rogue) {
        if (rogue.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            rogue.setHP(rogue.getHP() + 90);
            dataRepository.addData(new DataHelp(this, rogue));
        }
    }
    @Override
    public void help(Wizard wiz) {
        if (wiz.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            wiz.setHP(wiz.getHP() + 120);
            dataRepository.addData(new DataHelp(this, wiz));
        }
    }
    @Override
    public String getName() {
        return "LifeGiver";
    }
}
