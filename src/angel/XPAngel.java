package angel;

import engine.DataRepository;
import hero.Knight;
import hero.Pyromancer;
import hero.Rogue;
import hero.Wizard;
import logs.DataAngelKill;
import logs.DataHelp;
import logs.DataHit;

public class XPAngel extends Angel {
    public XPAngel(int x, int y) {
        super(x, y);
    }
    @Override
    public void help(Knight knight) {
        if (knight.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            knight.addXP(45);
            dataRepository.addData(new DataHelp(this, knight));
            knight.updateLevel();
        }
    }
    @Override
    public void help(Pyromancer pyro) {
        if (pyro.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            pyro.addXP(50);
            dataRepository.addData(new DataHelp(this, pyro));
            pyro.updateLevel();
        }
    }
    @Override
    public void help(Rogue rogue) {
        if (rogue.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            rogue.addXP(40);
            dataRepository.addData(new DataHelp(this, rogue));
            rogue.updateLevel();
        }
    }
    @Override
    public void help(Wizard wiz) {
        if (wiz.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            wiz.addXP(45);
            dataRepository.addData(new DataHelp(this, wiz));
            wiz.updateLevel();
        }
    }
    @Override
    public String getName() {
        return "XPAngel";
    }
}
