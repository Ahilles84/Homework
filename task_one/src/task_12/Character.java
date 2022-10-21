package task_12;

public abstract class Character {
    private final String name;
    private int health;
    private final int damage;

    public Character(String name, int hitPoints, int damagePoints) {
        this.name = name;
        this.health = hitPoints;
        this.damage = damagePoints;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isAlive(){
        return this.health > 0;
    }
}
