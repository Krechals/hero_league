package strategy;

import hero.Hero;

public class KnightPassive implements AttackStrategy {
    @Override
    public void applyStrategy(Hero hero) {
        hero.setHP(5 * hero.getHP() / 4);
        hero.getAbility1().setStrategyBonus(-0.20f);
        hero.getAbility2().setStrategyBonus(-0.20f);
    }
}