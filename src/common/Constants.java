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
    public static final float EXECUTE_DAMAGE = 200.0f;
    public static final float EXECUTE_BONUS_DAMAGE = 30.0f;
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
    public static final float PARALYSIS_DAMAGE = 40.0f;
    public static final float PARALYSIS_BONUS_DAMAGE = 10.0f;
    public static final float PARALYSIS_OVERTIME_DAMAGE = 40.0f;
    public static final float PARALYSIS_BONUS_OVERTIME = 10.0f;
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
    public static final float OVERTIME_DAMAGE = 0.0001f;
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
    public static final float PYRO_ATTACKS_WIZ_AMPLIFIER_1 = 1.05f;
    public static final float PYRO_ATTACKS_WIZ_AMPLIFIER_2 = 1.05f;

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

    // DamageAngel constants
    public static final float DAMAGE_ANGEL_KNIGHT = 0.15f;
    public static final float DAMAGE_ANGEL_PYRO = 0.20f;
    public static final float DAMAGE_ANGEL_ROGUE = 0.30f;
    public static final float DAMAGE_ANGEL_WIZ = 0.40f;

    // DarkAngel constants
    public static final int DARK_ANGEL_KNIGHT = 40;
    public static final int DARK_ANGEL_PYRO = 30;
    public static final int DARK_ANGEL_ROGUE = 10;
    public static final int DARK_ANGEL_WIZ = 20;

    // Dracula constants
    public static final float DRACULA_KNIGHT_ABILITY = -0.20f;
    public static final float DRACULA_PYRO_ABILITY = -0.30f;
    public static final float DRACULA_ROGUE_ABILITY = -0.10f;
    public static final float DRACULA_WIZ_ABILITY = -0.40f;
    public static final int DRACULA_KNIGHT_HP = 60;
    public static final int DRACULA_PYRO_HP = 40;
    public static final int DRACULA_ROGUE_HP = 35;
    public static final int DRACULA_WIZ_HP = 20;

    // GoodBoy constants
    public static final float GOODBOY_KNIGHT_ABILITY = 0.40f;
    public static final float GOODBOY_PYRO_ABILITY = 0.50f;
    public static final float GOODBOY_ROGUE_ABILITY = 0.40f;
    public static final float GOODBOY_WIZ_ABILITY = 0.30f;
    public static final int GOODBOY_KNIGHT_HP = 20;
    public static final int GOODBOY_PYRO_HP = 30;
    public static final int GOODBOY_ROGUE_HP = 40;
    public static final int GOODBOY_WIZ_HP = 50;

    // LevelUP constants
    public static final float LEVEL_ANGEL_KNIGHT = 0.10f;
    public static final float LEVEL_ANGEL_PYRO = 0.20f;
    public static final float LEVEL_ANGEL_ROGUE = 0.15f;
    public static final float LEVEL_ANGEL_WIZ = 0.25f;

    // LifeGiver constants
    public static final int LIFE_ANGEL_KNIGHT = 100;
    public static final int LIFE_ANGEL_PYRO = 80;
    public static final int LIFE_ANGEL_ROGUE = 90;
    public static final int LIFE_ANGEL_WIZ = 120;

    // SmallAngel constants
    public static final float SMALL_KNIGHT_ABILITY = 0.10f;
    public static final float SMALL_PYRO_ABILITY = 0.15f;
    public static final float SMALL_ROGUE_ABILITY = 0.05f;
    public static final float SMALL_WIZ_ABILITY = 0.10f;
    public static final int SMALL_KNIGHT_HP = 10;
    public static final int SMALL_PYRO_HP = 15;
    public static final int SMALL_ROGUE_HP = 20;
    public static final int SMALL_WIZ_HP = 25;

    // Spawner constants
    public static final int SPAWNER_ANGEL_KNIGHT = 200;
    public static final int SPAWNER_ANGEL_PYRO = 150;
    public static final int SPAWNER_ANGEL_ROGUE = 180;
    public static final int SPAWNER_ANGEL_WIZ = 120;

    // XPAngel constants
    public static final int XP_ANGEL_KNIGHT = 45;
    public static final int XP_ANGEL_PYRO = 50;
    public static final int XP_ANGEL_ROGUE = 40;
    public static final int XP_ANGEL_WIZ = 60;

    // Percentages
    public static final float HALF = 0.50f;
    public static final float THIRD = 0.33333f;
    public static final float QUARTER = 0.25f;
    public static final float FIFTH = 0.20f;
    public static final float SEVENTH = 0.14285f;

    // Strategy constants
    // Knight
    public static final float KNIGHT_AGGRESSIVE_HP = 0.80f;
    public static final float KNIGHT_AGGRESSIVE_AP = 0.50f;
    public static final float KNIGHT_PASSIVE_HP = 1.25f;
    public static final float KNIGHT_PASSIVE_AP = -0.20f;

    // Pyromancer
    public static final float PYRO_AGGRESSIVE_HP = 0.75f;
    public static final float PYRO_AGGRESSIVE_AP  = 0.70f;
    public static final float PYRO_PASSIVE_HP = 1.33333f;
    public static final float PYRO_PASSIVE_AP = -0.30f;

    // Rogue
    public static final float ROGUE_AGGRESSIVE_HP = 0.85714f;
    public static final float ROGUE_AGGRESSIVE_AP = 0.40f;
    public static final float ROGUE_PASSIVE_HP = 1.50f;
    public static final float ROGUE_PASSIVE_AP = -0.10f;

    // Wizard
    public static final float WIZARD_AGGRESSIVE_HP = 0.90f;
    public static final float WIZARD_AGGRESSIVE_AP = 0.60f;
    public static final float WIZARD_PASSIVE_HP = 1.20f;
    public static final float WIZARD_PASSIVE_AP = -0.20f;
}
