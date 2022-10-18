package task_12;

public abstract class Character {
    private final String name;
    private int hitPoints;
    private final int damagePoints;

    public Character(String name, int hitPoints, int damagePoints) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damagePoints = damagePoints;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getDamagePoints() {
        return damagePoints;
    }

    public boolean isAlive(){
        return this.hitPoints > 0;
    }
}
