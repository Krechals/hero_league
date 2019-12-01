package ability;

public final class AbilityFactory {
    private static final AbilityFactory INSTANCE = new AbilityFactory();

    private AbilityFactory() { }

    public static AbilityFactory getInstance() {
        return INSTANCE;
    }
    // Factory Design Pattern
    public Ability createAbility(final AbilityList ability) {
        if (ability == AbilityList.BACKSTAB) {
            return new Backstab();
        } else if (ability == AbilityList.DEFLECT) {
            return new Deflect();
        } else if (ability == AbilityList.DRAIN) {
            return new Drain();
        } else if (ability == AbilityList.EXECUTE) {
            return new Execute();
        } else if (ability == AbilityList.FIREBLAST) {
            return new Fireblast();
        } else if (ability == AbilityList.IGNITE) {
            return new Ignite();
        } else if (ability == AbilityList.PARALYSIS) {
            return new Paralysis();
        }
        return new Slam();

    }
}
