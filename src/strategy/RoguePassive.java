package strategy;

import hero.Hero;

public class RoguePassive implements AttackStrategy{
    @Override
    public void applyStrategy(Hero hero) {
        hero.setHP(3 * hero.getHP() / 2);
        hero.getAbility1().setStrategyBonus(-0.10f);
        hero.getAbility2().setStrategyBonus(-0.10f);
    }
}
