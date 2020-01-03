package angel;

import common.Constants;
import engine.DataRepository;
import hero.Knight;
import hero.Pyromancer;
import hero.Rogue;
import hero.Wizard;
import logs.DataHelp;
import logs.DataRevive;

public class Spawner extends Angel {

    public Spawner(final int x, final int y) {
        super(x, y);
    }
    @Override
    public final void help(final Knight knight) {
        if (!knight.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            knight.setHP(Constants.SPAWNER_ANGEL_KNIGHT);
            // Revives the Hero
            knight.revive();
            dataRepository.addData(new DataHelp(this, knight));
            dataRepository.addData(new DataRevive(knight));
        }
    }
    @Override
    public final void help(final Pyromancer pyro) {
        if (!pyro.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            // Revives the Hero
            pyro.setHP(Constants.SPAWNER_ANGEL_PYRO);
            pyro.revive();
            dataRepository.addData(new DataHelp(this, pyro));
            dataRepository.addData(new DataRevive(pyro));
        }
    }
    @Override
    public final void help(final Rogue rogue) {
        if (!rogue.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            // Revives the Hero
            rogue.setHP(Constants.SPAWNER_ANGEL_ROGUE);
            rogue.revive();
            dataRepository.addData(new DataHelp(this, rogue));
            dataRepository.addData(new DataRevive(rogue));
        }
    }
    @Override
    public final void help(final Wizard wiz) {
        if (!wiz.isAlive()) {
            DataRepository dataRepository = DataRepository.getInstance();
            // Revives the Hero
            wiz.setHP(Constants.SPAWNER_ANGEL_WIZ);
            wiz.revive();
            dataRepository.addData(new DataHelp(this, wiz));
            dataRepository.addData(new DataRevive(wiz));
        }
    }
    @Override
    public final String getName() {
        return "Spawner";
    }

}
