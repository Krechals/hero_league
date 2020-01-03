package angel;

import common.Constants;
import engine.DataRepository;
import hero.Knight;
import hero.Pyromancer;
import hero.Rogue;
import hero.Wizard;
import logs.DataHelp;

public class XPAngel extends Angel {
    public XPAngel(final int x, final int y) {
        super(x, y);
    }
    @Override
    public final void help(final Knight knight) {
        if (knight.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            // Adds XP to the Hero
            knight.addXP(Constants.XP_ANGEL_KNIGHT);
            dataRepository.addData(new DataHelp(this, knight));
            // Levels UP the Hero, if needed
            knight.updateLevel();
        }
    }
    @Override
    public final void help(final Pyromancer pyro) {
        if (pyro.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            // Adds XP to the Hero
            pyro.addXP(Constants.XP_ANGEL_PYRO);
            dataRepository.addData(new DataHelp(this, pyro));
            // Levels UP the Hero, if needed
            pyro.updateLevel();
        }
    }
    @Override
    public final void help(final Rogue rogue) {
        if (rogue.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            // Adds XP to the Hero
            rogue.addXP(Constants.XP_ANGEL_ROGUE);
            dataRepository.addData(new DataHelp(this, rogue));
            // Levels UP the Hero, if needed
            rogue.updateLevel();
        }
    }
    @Override
    public final void help(final Wizard wiz) {
        if (wiz.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            // Adds XP to the Hero
            wiz.addXP(Constants.XP_ANGEL_WIZ);
            dataRepository.addData(new DataHelp(this, wiz));
            // Levels UP the Hero, if needed
            wiz.updateLevel();
        }
    }
    @Override
    public final String getName() {
        return "XPAngel";
    }
}
