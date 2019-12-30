package strategy;

import hero.Hero;

public class WizardPassive implements AttackStrategy {
    @Override
    public void applyStrategy(Hero hero) {
        hero.setHP(6 * hero.getHP() / 5);
        hero.getAbility1().setStrategyBonus(-0.20f);
        hero.getAbility2().setStrategyBonus(-0.20f);
    }
}
