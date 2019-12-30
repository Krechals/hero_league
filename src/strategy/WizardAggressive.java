package strategy;

import hero.Hero;

public class WizardAggressive implements AttackStrategy {
    @Override
    public void applyStrategy(Hero hero) {
        hero.setHP(9 * hero.getHP() / 10);
        hero.getAbility1().setStrategyBonus(0.60f);
        hero.getAbility2().setStrategyBonus(0.60f);
    }
}
