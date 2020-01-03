package strategy;

import common.Constants;
import hero.Hero;

public final class PyromancerAggressive implements AttackStrategy {

    @Override
    public void applyStrategy(final Hero hero) {
        hero.setHP((int) (hero.getHP() * Constants.PYRO_AGGRESSIVE_HP));
        hero.getAbility1().setStrategyBonus(Constants.PYRO_AGGRESSIVE_AP);
        hero.getAbility2().setStrategyBonus(Constants.PYRO_AGGRESSIVE_AP);
    }
}
