package strategy;

import hero.Hero;

public class WizardPassive implements AttackStrategy {
    @Override
    public void applyStrategy(Hero hero) {
        hero.setHP(Math.round(hero.getHP() * 6.0f / 5.0f));
        hero.getAbility1().setStrategyBonus(-0.20f);
        hero.getAbility2().setStrategyBonus(-0.20f);
    }
}
