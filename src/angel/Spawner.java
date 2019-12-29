package angel;

import engine.DataRepository;
import hero.Knight;
import hero.Pyromancer;
import hero.Rogue;
import hero.Wizard;
import logs.DataHelp;
import logs.DataRevive;

public class Spawner extends Angel {

    public Spawner(int x, int y) {
        super(x, y);
    }
    @Override
    public void help(Knight knight) {
        if (!knight.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            knight.setHP(200);
            knight.revive();
            dataRepository.addData(new DataHelp(this, knight));
            dataRepository.addData(new DataRevive(knight));
        }
    }
    @Override
    public void help(Pyromancer pyro) {
        if (!pyro.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            pyro.setHP(150);
            pyro.revive();
            dataRepository.addData(new DataHelp(this, pyro));
            dataRepository.addData(new DataRevive(pyro));
        }
    }
    @Override
    public void help(Rogue rogue) {
        if (!rogue.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            rogue.setHP(180);
            rogue.revive();
            dataRepository.addData(new DataHelp(this, rogue));
            dataRepository.addData(new DataRevive(rogue));
        }
    }
    @Override
    public void help(Wizard wiz) {
        if (!wiz.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            wiz.setHP(120);
            wiz.revive();
            dataRepository.addData(new DataHelp(this, wiz));
            dataRepository.addData(new DataRevive(wiz));
        }
    }
    @Override
    public String getName() {
        return "Spawner";
    }

}
