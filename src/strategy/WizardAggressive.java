package strategy;

import common.Constants;
import hero.Hero;

public final class WizardAggressive implements AttackStrategy {

    @Override
    public void applyStrategy(final Hero hero) {
        hero.setHP((int) (hero.getHP() * Constants.WIZARD_AGGRESSIVE_HP));
        hero.getAbility1().setStrategyBonus(Constants.WIZARD_AGGRESSIVE_AP);
        hero.getAbility2().setStrategyBonus(Constants.WIZARD_AGGRESSIVE_AP);
    }
}
