package strategy;

import hero.Hero;

public class PyromancerPassive implements AttackStrategy {
    @Override
    public void applyStrategy(Hero hero) {
        hero.setHP(4 * hero.getHP() / 3);
        hero.getAbility1().setStrategyBonus(-0.30f);
        hero.getAbility2().setStrategyBonus(-0.30f);
    }
}
