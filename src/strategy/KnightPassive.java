package strategy;

import common.Constants;
import hero.Hero;

public final class KnightPassive implements AttackStrategy {

    @Override
    public void applyStrategy(final Hero hero) {
        hero.setHP((int) (hero.getHP() * Constants.KNIGHT_PASSIVE_HP));
        hero.getAbility1().setStrategyBonus(Constants.KNIGHT_PASSIVE_AP);
        hero.getAbility2().setStrategyBonus(Constants.KNIGHT_PASSIVE_AP);
    }
}
