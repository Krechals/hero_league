package strategy;

import common.Constants;
import hero.Hero;

public final class RoguePassive implements AttackStrategy {

    @Override
    public void applyStrategy(final Hero hero) {
        hero.setHP((int) (hero.getHP() * Constants.ROGUE_PASSIVE_HP));
        hero.getAbility1().setStrategyBonus(Constants.ROGUE_PASSIVE_AP);
        hero.getAbility2().setStrategyBonus(Constants.ROGUE_PASSIVE_AP);
    }
}
