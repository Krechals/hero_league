package angel;

import common.Constants;
import engine.DataRepository;
import hero.Knight;
import hero.Pyromancer;
import hero.Rogue;
import hero.Wizard;
import logs.DataHelp;

public class LevelUpAngel extends Angel {
    public LevelUpAngel(final int x, final int y) {
        super(x, y);
    }
    @Override
    public final void help(final Knight knight) {
        if (knight.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            // Increases ability power
            knight.addAngelBonus(Constants.LEVEL_ANGEL_KNIGHT);
            dataRepository.addData(new DataHelp(this, knight));
            // Levels UP the Hero
            knight.levelUP();
        }
    }
    @Override
    public final void help(final Pyromancer pyro) {
        if (pyro.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            // Increases ability power
            pyro.addAngelBonus(Constants.LEVEL_ANGEL_PYRO);
            dataRepository.addData(new DataHelp(this, pyro));
            // Levels UP the Hero
            pyro.levelUP();
        }
    }
    @Override
    public final void help(final Rogue rogue) {
        if (rogue.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            // Increases ability power
            rogue.addAngelBonus(Constants.LEVEL_ANGEL_ROGUE);
            dataRepository.addData(new DataHelp(this, rogue));
            // Levels UP the Hero
            rogue.levelUP();
        }
    }
    @Override
    public final void help(final Wizard wiz) {
        if (wiz.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            // Increases ability power
            wiz.addAngelBonus(Constants.LEVEL_ANGEL_WIZ);
            dataRepository.addData(new DataHelp(this, wiz));
            // Levels UP the Hero
            wiz.levelUP();
        }
    }
    @Override
    public final String getName() {
        return "LevelUpAngel";
    }
}
