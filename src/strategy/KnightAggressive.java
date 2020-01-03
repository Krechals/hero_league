package strategy;

import common.Constants;
import hero.Hero;

public final class KnightAggressive implements AttackStrategy {

    @Override
    public void applyStrategy(final Hero hero) {
        hero.setHP(Math.round(hero.getHP() * Constants.KNIGHT_AGGRESSIVE_HP));
        hero.getAbility1().setStrategyBonus(Constants.KNIGHT_AGGRESSIVE_AP);
        hero.getAbility2().setStrategyBonus(Constants.KNIGHT_AGGRESSIVE_AP);
    }
}
