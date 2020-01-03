package strategy;

import common.Constants;
import hero.Hero;

public final class WizardPassive implements AttackStrategy {

    @Override
    public void applyStrategy(final Hero hero) {
        hero.setHP((int) (hero.getHP() * Constants.WIZARD_PASSIVE_HP));
        hero.getAbility1().setStrategyBonus(Constants.WIZARD_PASSIVE_AP);
        hero.getAbility2().setStrategyBonus(Constants.WIZARD_PASSIVE_AP);
    }
}
