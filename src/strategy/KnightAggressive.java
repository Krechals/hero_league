package strategy;

import hero.Hero;

public class KnightAggressive implements AttackStrategy {
    @Override
    public void applyStrategy(Hero hero) {
        hero.setHP(4 * hero.getHP() / 5);
        hero.getAbility1().setStrategyBonus(0.50f);
        hero.getAbility2().setStrategyBonus(0.50f);
    }
}
