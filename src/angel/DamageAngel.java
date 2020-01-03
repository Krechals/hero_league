package angel;

import common.Constants;
import engine.DataRepository;
import hero.Knight;
import hero.Pyromancer;
import hero.Rogue;
import hero.Wizard;
import logs.DataHelp;

public class DamageAngel extends Angel {

    public DamageAngel(final int x, final int y) {
        super(x, y);
    }
    @Override
    public final void help(final Knight knight) {
        if (knight.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            // Adds ability bonus
            knight.addAngelBonus(Constants.DAMAGE_ANGEL_KNIGHT);
            dataRepository.addData(new DataHelp(this, knight));
        }
    }
    @Override
    public final void help(final Pyromancer pyro) {
        if (pyro.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            // Adds ability bonus
            pyro.addAngelBonus(Constants.DAMAGE_ANGEL_PYRO);
            dataRepository.addData(new DataHelp(this, pyro));
        }
    }
    @Override
    public final void help(final Rogue rogue) {
        if (rogue.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            // Adds ability bonus
            rogue.addAngelBonus(Constants.DAMAGE_ANGEL_ROGUE);
            dataRepository.addData(new DataHelp(this, rogue));
        }
    }
    @Override
    public final void help(final Wizard wiz) {
        if (wiz.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            // Adds ability bonus
            wiz.addAngelBonus(Constants.DAMAGE_ANGEL_WIZ);
            dataRepository.addData(new DataHelp(this, wiz));
        }
    }
    @Override
    public final String getName() {
        return "DamageAngel";
    }
}
