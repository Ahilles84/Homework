package task_12;

public class Knight extends Character {
    private static int dodgeChance;

    public Knight(String name, int hitPoints, int damagePoints, int dodgeChance) {
        super(name, hitPoints, damagePoints);
        Knight.dodgeChance = dodgeChance;
    }

    public static int getDodgeChance() {
        return dodgeChance;
    }
}