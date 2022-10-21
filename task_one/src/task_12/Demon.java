package task_12;

public class Demon extends Character{
    private static int postMortDamage;
    public Demon(String name, int health, int damage, int postMortDamage) {
        super(name, health, damage);
        Demon.postMortDamage = postMortDamage;
    }

    public static int getPostMortDamage() {
        return postMortDamage;
    }

}
