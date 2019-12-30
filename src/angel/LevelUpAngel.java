package angel;

import engine.DataRepository;
import hero.Knight;
import hero.Pyromancer;
import hero.Rogue;
import hero.Wizard;
import logs.DataHelp;

public class LevelUpAngel extends Angel {
    public LevelUpAngel(int x, int y) {
        super(x, y);
    }
    @Override
    public void help(Knight knight) {
        if (knight.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            knight.addAngelBonus(0.10f);
            dataRepository.addData(new DataHelp(this, knight));
            knight.levelUP();
        }
    }
    @Override
    public void help(Pyromancer pyro) {
        if (pyro.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            pyro.addAngelBonus(0.20f);
            dataRepository.addData(new DataHelp(this, pyro));
            pyro.levelUP();
        }
    }
    @Override
    public void help(Rogue rogue) {
        if (rogue.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            rogue.addAngelBonus(0.15f);
            dataRepository.addData(new DataHelp(this, rogue));
            rogue.levelUP();
        }
    }
    @Override
    public void help(Wizard wiz) {
        if (wiz.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            wiz.addAngelBonus(0.25f);
            dataRepository.addData(new DataHelp(this, wiz));
            wiz.levelUP();
        }
    }
    @Override
    public String getName() {
        return "LevelUpAngel";
    }
}
