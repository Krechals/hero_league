package strategy;

import hero.Hero;

public interface AttackStrategy {
    /**
     * Strategy to be applied during a round.
     * @param hero Hero who applies the strategy
     */
    void applyStrategy(Hero hero);
}
