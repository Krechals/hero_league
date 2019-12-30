package strategy;

import hero.Hero;

public class PyromancerAggressive implements AttackStrategy {
    @Override
    public void applyStrategy(Hero hero) {
        hero.setHP(3 * hero.getHP() / 4);
        hero.getAbility1().setStrategyBonus(0.70f);
        hero.getAbility2().setStrategyBonus(0.70f);
    }
}
