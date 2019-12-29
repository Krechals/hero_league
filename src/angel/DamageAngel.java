package angel;

import engine.DataRepository;
import hero.Knight;
import hero.Pyromancer;
import hero.Rogue;
import hero.Wizard;
import logs.DataHelp;

public class DamageAngel extends Angel {

    public DamageAngel(int x, int y) {
        super(x, y);
    }
    @Override
    public void help(Knight knight) {
        if (knight.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            knight.addAngelBonus(0.15f);
            dataRepository.addData(new DataHelp(this, knight));
        }
    }
    @Override
    public void help(Pyromancer pyro) {
        if (pyro.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            pyro.addAngelBonus(0.20f);
            dataRepository.addData(new DataHelp(this, pyro));
        }
    }
    @Override
    public void help(Rogue rogue) {
        if (rogue.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            rogue.addAngelBonus(0.30f);
            dataRepository.addData(new DataHelp(this, rogue));
        }
    }
    @Override
    public void help(Wizard wiz) {
        if (wiz.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            wiz.addAngelBonus(0.40f);
            dataRepository.addData(new DataHelp(this, wiz));
        }
    }
    @Override
    public String getName() {
        return "DamageAngel";
    }
}
