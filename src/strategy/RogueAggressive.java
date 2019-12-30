package strategy;

import hero.Hero;

public class RogueAggressive implements AttackStrategy {
    @Override
    public void applyStrategy(Hero hero) {
        hero.setHP(6 * hero.getHP() / 7);
        hero.getAbility1().setStrategyBonus(0.40f);
        hero.getAbility2().setStrategyBonus(0.40f);
    }
}
