package task_12;

public class TheGame {

    private final Character player1;
    private final Character player2;

    public TheGame(Character player1, Character player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public static void hit(Character hitter, Character victim){
        victim.setHitPoints(victim.getHitPoints() - hitter.getDamagePoints());
    }

    public void fight(){
        int hitCounter = 0;
        while(player1.isAlive() || player2.isAlive()){
            hitCounter++;
            hit(player1,player2);
            if(!player2.isAlive()){
                player1.setHitPoints(player1.getHitPoints() - Demon.getPostMortDamage());
                if (!player1.isAlive()){
                    System.out.println("Draw!");
                } else {
                    System.out.println(player1.getName() + " won!");
                }
                return;
            }
            if(hitCounter % Knight.getDodgeChance() != 0){
                hit(player2,player1);
                if(!player1.isAlive()){
                    System.out.println(player2.getName() + " won!");
                    return;
                }
            }
        }
    }
}
