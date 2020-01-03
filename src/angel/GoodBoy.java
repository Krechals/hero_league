package angel;

import common.Constants;
import engine.DataRepository;
import hero.Knight;
import hero.Pyromancer;
import hero.Rogue;
import hero.Wizard;
import logs.DataHelp;

public class GoodBoy extends Angel {
    public GoodBoy(final int x, final int y) {
        super(x, y);
    }
    @Override
    public final void help(final Knight knight) {
        if (knight.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            // Increases ability power
            knight.addAngelBonus(Constants.GOODBOY_KNIGHT_ABILITY);
            // Increases hero's HP
            knight.setHP(knight.getHP() + Constants.GOODBOY_KNIGHT_HP);
            dataRepository.addData(new DataHelp(this, knight));
        }
    }
    @Override
    public final void help(final Pyromancer pyro) {
        if (pyro.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            // Increases ability power
            pyro.addAngelBonus(Constants.GOODBOY_PYRO_ABILITY);
            // Increases hero's HP
            pyro.setHP(pyro.getHP() + Constants.GOODBOY_PYRO_HP);
            dataRepository.addData(new DataHelp(this, pyro));
        }
    }
    @Override
    public final void help(final Rogue rogue) {
        if (rogue.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            // Increases ability power
            rogue.addAngelBonus(Constants.GOODBOY_ROGUE_ABILITY);
            // Increases hero's HP
            rogue.setHP(rogue.getHP() + Constants.GOODBOY_ROGUE_HP);
            dataRepository.addData(new DataHelp(this, rogue));
        }
    }
    @Override
    public final void help(final Wizard wiz) {
        if (wiz.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            // Increases ability power
            wiz.addAngelBonus(Constants.GOODBOY_WIZ_ABILITY);
            // Increases hero's HP
            wiz.setHP(wiz.getHP() + Constants.GOODBOY_WIZ_HP);
            dataRepository.addData(new DataHelp(this, wiz));
        }
    }
    @Override
    public final String getName() {
        return "GoodBoy";
    }
}
