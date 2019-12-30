package strategy;

import hero.Hero;

public class KnightAggressive implements AttackStrategy {
    @Override
    public void applyStrategy(Hero hero) {
        hero.setHP(Math.round(hero.getHP() * 4.0f / 5.0f));
        hero.getAbility1().setStrategyBonus(0.50f);
        hero.getAbility2().setStrategyBonus(0.50f);
    }
}
