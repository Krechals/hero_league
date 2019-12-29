package angel;

import engine.DataRepository;
import hero.Knight;
import hero.Pyromancer;
import hero.Rogue;
import hero.Wizard;
import logs.DataHit;

public class Dracula extends Angel{

    public Dracula(int x, int y) {
        super(x, y);
    }
    @Override
    public void help(Knight knight) {
        if (knight.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            knight.addAngelBonus(-0.20f);
            knight.decreaseHP(60);
            dataRepository.addData(new DataHit(this, knight));
        }
    }
    @Override
    public void help(Pyromancer pyro) {
        if (pyro.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            pyro.addAngelBonus(-0.30f);
            pyro.decreaseHP(40);
            dataRepository.addData(new DataHit(this, pyro));
        }
    }
    @Override
    public void help(Rogue rogue) {
        if (rogue.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            rogue.addAngelBonus(-0.10f);
            rogue.decreaseHP(35);
            dataRepository.addData(new DataHit(this, rogue));
        }
    }
    @Override
    public void help(Wizard wiz) {
        if (wiz.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            wiz.addAngelBonus(-0.40f);
            wiz.decreaseHP(20);
            dataRepository.addData(new DataHit(this, wiz));
        }
    }
    @Override
    public String getName() {
        return "Dracula";
    }
}
