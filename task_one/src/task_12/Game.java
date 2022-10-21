package task_12;

public class Game {

    private final Character player1;
    private final Character player2;

    public Game(Character player1, Character player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    public static void hit(Character hitter, Character victim){
        victim.setHealth(victim.getHealth() - hitter.getDamage());
    }

    public void fight(){
        int hitCounter = 0;
        while(player1.isAlive() && player2.isAlive()){
            hitCounter++;
            hit(player1,player2);
            if(!player2.isAlive()){
                player1.setHealth(player1.getHealth() - Demon.getPostMortDamage());
                if (!player1.isAlive()){
                    System.out.println("Draw! Both are dead. :\\");
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
