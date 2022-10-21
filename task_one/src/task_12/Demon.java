package task_12;

public class Demon extends Character{
    private static int postMortDamage;
    public Demon(String name, int hitPoints, int damagePoints, int postMortDamage) {
        super(name, hitPoints, damagePoints);
        Demon.postMortDamage = postMortDamage;
    }

    public static int getPostMortDamage() {
        return postMortDamage;
    }

}
