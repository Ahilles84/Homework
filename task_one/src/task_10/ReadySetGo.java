package task_10;

import task_8.ATM;
import task_8.DebitCard;

public class ReadySetGo {
    public static void main(String[] args) throws InterruptedException{
        try {
            DebitCard debitCard = new DebitCard(1234);
            ATM.checkPIN(debitCard);
            CardholderService service = new CardholderService(debitCard, (int) (Math.random() * 1000000), 3, 5);
            Thread toppingUp = new TopUpAccount(service);
            Thread withdrawing = new Withdraw(service);
            toppingUp.start();
            withdrawing.start();
            toppingUp.join();
            withdrawing.join();
            System.err.println("We spent all the money!");
        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}

