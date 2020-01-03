package strategy;

import common.Constants;
import hero.Hero;

public final class RogueAggressive implements AttackStrategy {

    @Override
    public void applyStrategy(final Hero hero) {
        hero.setHP(Math.round(hero.getHP() * Constants.ROGUE_AGGRESSIVE_HP));
        hero.getAbility1().setStrategyBonus(Constants.ROGUE_AGGRESSIVE_AP);
        hero.getAbility2().setStrategyBonus(Constants.ROGUE_AGGRESSIVE_AP);
    }
}
