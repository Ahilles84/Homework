package task_10;

import task_8.Card;
import task_8.CardholderService;
import task_8.DebitCard;

public class ReadySetGo {
    public static void main(String[] args) {
        try {
            Card debitCard = new DebitCard(1234);
            CardholderService.checkPIN(debitCard);
            Service service = new Service((DebitCard) debitCard, (int) (Math.random() * 1000000));
            Thread toppingUp = new TopUpAccount(service);
            Thread withdrawing = new Withdraw(service);
            toppingUp.start();
            withdrawing.start();
            toppingUp.join();
            withdrawing.join();
            Thread.sleep(1000);
            System.out.println("We spent all the money!");
        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

