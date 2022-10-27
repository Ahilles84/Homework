package the_rpg_game;

public class Knight extends Character {
    private static int dodgeChance;

    public Knight(String name, int health, int damage, int dodgeChance) {
        super(name, health, damage);
        Knight.dodgeChance = dodgeChance;
    }

    public static int getDodgeChance() {
        return dodgeChance;
    }
}