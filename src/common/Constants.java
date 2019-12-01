package common;

public final class Constants {
    private Constants() {
        // NOT CALLED
    }
    // Backstab constants
    public static final int BACKSTAB_DAMAGE = 200;
    public static final int BACKSTAB_BONUS_DAMAGE = 20;
    public static final float BACKSTAB_CRITICAL = 1.5f;
    public static final int BACKSTAB_CRITICAL_ROUND = 3;
    // Deflect constatnts
    public static final float DEFLECT_PERCENT = 0.35f;
    public static final float DEFLECT_BONUS_PERCENT = 0.02f;
    public static final float DEFLECT_MAX_PERCENT = 0.70f;
    // Drain constants
    public static final float DRAIN_PERCENT = 0.20f;
    public static final float DRAIN_BONUS_PERCENT = 0.05f;
    public static final float DRAIN_FORMULA_PERCENT = 0.30f;
    // Execute constants
    public static final int EXECUTE_DAMAGE = 200;
    public static final int EXECUTE_BONUS_DAMAGE = 30;
    public static final float EXECUTE_LIMIT_HP = 0.20f;
    public static final float EXECUTE_BONUS_LIMIT = 0.01f;
    public static final float EXECUTE_MAX_LIMIT = 0.40f;
    // Fireblast constants
    public static final int FIREBLAST_DAMAGE = 350;
    public static final int FIREBLAST_BONUS_DAMAGE = 50;
    // Ignite constants
    public static final int IGNITE_DAMAGE = 150;
    public static final int IGNITE_BONUS_DAMAGE = 20;
    public static final int IGNITE_OVERTIME_DAMAGE = 50;
    public static final int IGNITE_BONUS_OVERTIME = 30;
    public static final int IGNITE_ROUNDS_OVERTIME = 2;
    // Paralysis constants
    public static final int PARALYSIS_DAMAGE = 40;
    public static final int PARALYSIS_BONUS_DAMAGE = 10;
    public static final int PARALYSIS_OVERTIME_DAMAGE = 40;
    public static final int PARALYSIS_BONUS_OVERTIME = 10;
    public static final int PARALYSIS_ROUNDS_OVERTIME = 3;
    public static final int PARALYSIS_BONUS_ROUNDS_OVERTIME = 6;
    // Slam constants
    public static final int SLAM_DAMAGE = 100;
    public static final int SLAM_BONUS_DAMAGE = 40;
    public static final int SLAM_ROUNDS_OVERTIME = 1;

    // Hero's initials
    public static final String KNIGHT_INITIAL = "K";
    public static final String PYRO_INITIAL = "P";
    public static final String ROGUE_INITIAL = "R";

    public static final float NO_APLIFICATION = 1f;
    // Knight constants
    public static final int KNIGHT_HP = 900;
    public static final int KNIGHT_BONUS_HP = 80;
    public static final float KNIGHT_LAND_AMPLIFIER = 1.15f;
    public static final float KNIGHT_ATTACKS_KNIGHT_AMPLIFIER_2 = 1.20f;
    public static final float KNIGHT_ATTACKS_PYRO_AMPLIFIER_1 = 1.1f;
    public static final float KNIGHT_ATTACKS_PYRO_AMPLIFIER_2 = 0.9f;
    public static final float KNIGHT_ATTACKS_ROGUE_AMPLIFIER_1 = 1.15f;
    public static final float KNIGHT_ATTACKS_ROGUE_AMPLIFIER_2 = 0.80f;
    public static final float KNIGHT_ATTACKS_WIZ_AMPLIFIER_1 = 0.80f;
    public static final float KNIGHT_ATTACKS_WIZ_AMPLIFIER_2 = 1.05f;

    // Pyromancer constants
    public static final int PYRO_HP = 500;
    public static final int PYRO_BONUS_HP = 50;
    public static final float PYRO_LAND_AMPLIFIER = 1.25f;
    public static final float PYRO_ATTACKS_KNIGHT_AMPLIFIER_1 = 1.20f;
    public static final float PYRO_ATTACKS_KNIGHT_AMPLIFIER_2 = 1.20f;
    public static final float PYRO_ATTACKS_PYRO_AMPLIFIER_1 = 0.9f;
    public static final float PYRO_ATTACKS_PYRO_AMPLIFIER_2 = 0.9f;
    public static final float PYRO_ATTACKS_ROGUE_AMPLIFIER_1 = 0.80f;
    public static final float PYRO_ATTACKS_ROGUE_AMPLIFIER_2 = 0.80f;
    public static final float PYRO_ATTACKS_WIZ_AMPLIFIER_1 = 0.95f;
    public static final float PYRO_ATTACKS_WIZ_AMPLIFIER_2 = 0.95f;

    // Rogue constants
    public static final int ROGUE_HP = 600;
    public static final int ROGUE_BONUS_HP = 40;
    public static final float ROGUE_LAND_AMPLIFIER = 1.15f;
    public static final float ROGUE_ATTACKS_KNIGHT_AMPLIFIER_1 = 0.90f;
    public static final float ROGUE_ATTACKS_KNIGHT_AMPLIFIER_2 = 0.80f;
    public static final float ROGUE_ATTACKS_PYRO_AMPLIFIER_1 = 1.25f;
    public static final float ROGUE_ATTACKS_PYRO_AMPLIFIER_2 = 1.20f;
    public static final float ROGUE_ATTACKS_ROGUE_AMPLIFIER_1 = 1.20f;
    public static final float ROGUE_ATTACKS_ROGUE_AMPLIFIER_2 = 0.90f;
    public static final float ROGUE_ATTACKS_WIZ_AMPLIFIER_1 = 1.25f;
    public static final float ROGUE_ATTACKS_WIZ_AMPLIFIER_2 = 1.25f;

    // Wizard constants
    public static final int WIZ_HP = 400;
    public static final int WIZ_BONUS_HP = 30;
    public static final float WIZ_LAND_AMPLIFIER = 1.10f;
    public static final float WIZ_ATTACKS_KNIGHT_AMPLIFIER_1 = 1.20f;
    public static final float WIZ_ATTACKS_KNIGHT_AMPLIFIER_2 = 1.40f;
    public static final float WIZ_ATTACKS_PYRO_AMPLIFIER_1 = 0.90f;
    public static final float WIZ_ATTACKS_PYRO_AMPLIFIER_2 = 1.30f;
    public static final float WIZ_ATTACKS_ROGUE_AMPLIFIER_1 = 0.80f;
    public static final float WIZ_ATTACKS_ROGUE_AMPLIFIER_2 = 1.20f;
    public static final float WIZ_ATTACKS_WIZ_AMPLIFIER_1 = 1.05f;

    // Hero constants
    public static final int HERO_FIRST_LEVEL = 200;
    public static final int HERO_LEVEL_UP = 50;
    public static final int HERO_XP_FORMULA = 200;
    public static final int HERO_XP_MULTIPLIER = 40;
}
