package strategy;

import common.Constants;
import hero.Hero;

public final class PyromancerPassive implements AttackStrategy {

    @Override
    public void applyStrategy(final Hero hero) {
        hero.setHP(Math.round(hero.getHP() * Constants.PYRO_PASSIVE_HP));
        hero.getAbility1().setStrategyBonus(Constants.PYRO_PASSIVE_AP);
        hero.getAbility2().setStrategyBonus(Constants.PYRO_PASSIVE_AP);
    }
}
