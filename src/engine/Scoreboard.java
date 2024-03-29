package engine;

import hero.Hero;
import setup.SingletonHeroList;
import fileio.FileSystem;

import java.util.List;

public final class Scoreboard {
    // Uses GreatMagician's notifications to print logs from each single round

    private Scoreboard() {
        // NOT CALLED
    }
    public static void print(final String mInputPath, final String mOutputPath) {
        List<Hero> heros = SingletonHeroList.getInstance().getHeroes();
        try {
            FileSystem fs = new FileSystem(mInputPath, mOutputPath);
            for (String data : GreatMagician.getInstance().getLogs()) {
                fs.writeWord(data);
                fs.writeNewLine();
            }
            fs.writeWord("~~ Results ~~");
            fs.writeNewLine();
            for (Hero h : heros) {

                fs.writeWord(h.getInitial() + " ");
                if (h.isAlive()) {
                    fs.writeWord(h.getLevel() + " " + h.getXP() + " " + h.getHP()
                                    + " " + h.getxLocation() + " " + h.getyLocation());
                    fs.writeNewLine();
                } else {
                    fs.writeWord("dead");
                    fs.writeNewLine();
                }
            }
            fs.close();
        } catch (Exception e1) {
            e1.printStackTrace();
        }

    }
}
