package angel;

import engine.DataRepository;
import hero.Knight;
import hero.Pyromancer;
import hero.Rogue;
import hero.Wizard;
import logs.DataHelp;

public class GoodBoy extends Angel {
    public GoodBoy(int x, int y) {
        super(x, y);
    }
    @Override
    public void help(Knight knight) {
        if (knight.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            knight.addAngelBonus(0.40f);
            knight.setHP(knight.getHP() + 20);
            dataRepository.addData(new DataHelp(this, knight));
        }
    }
    @Override
    public void help(Pyromancer pyro) {
        if (pyro.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            pyro.addAngelBonus(0.50f);
            pyro.setHP(pyro.getHP() + 30);
            dataRepository.addData(new DataHelp(this, pyro));
        }
    }
    @Override
    public void help(Rogue rogue) {
        if (rogue.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            rogue.addAngelBonus(0.40f);
            rogue.setHP(rogue.getHP() + 40);
            dataRepository.addData(new DataHelp(this, rogue));
        }
    }
    @Override
    public void help(Wizard wiz) {
        if (wiz.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            wiz.addAngelBonus(0.30f);
            wiz.setHP(wiz.getHP() + 50);
            dataRepository.addData(new DataHelp(this, wiz));
        }
    }
    @Override
    public String getName() {
        return "GoodBoy";
    }
}
