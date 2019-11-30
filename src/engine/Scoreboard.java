package engine;

import hero.Hero;
import setup.SingletonHeroList;
import fileio.FileSystem;

import java.util.List;

public class Scoreboard {

    public static void print(String mInputPath, String mOutputPath) {
        List<Hero> heros = SingletonHeroList.getInstance().getHeroes();
        try {
            FileSystem fs = new FileSystem(mInputPath, mOutputPath);
            for (Hero h : heros) {

                fs.writeWord(h.getInitial() + " ");
                if (h.isAlive()) {
                    fs.writeWord(h.getLevel() + " " + h.getXP() + " " + h.getHP() + " " + h.getxLocation() + " " + h.getyLocation());
                    fs.writeNewLine();
                    // System.out.println(h.getLevel() + " " + h.getXP() + " " + h.getHP() + " " + h.getxLocation() + " " + h.getyLocation());
                } else {
                    fs.writeWord("dead");
                    fs.writeNewLine();
                    // System.out.println("DEAD");
                }
            }
            fs.close();
        } catch (Exception e1) {
            e1.printStackTrace();
        }

    }
}
