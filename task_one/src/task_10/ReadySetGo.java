package task_10;

import task_8.DebitCard;

public class ReadySetGo {
    public static void main(String[] args) throws InterruptedException{
        DebitCard debitCard = new DebitCard(1234);
        CardholderService service = new CardholderService(debitCard, (int)(Math.random()*1000000), 3, 5);
        Thread toppingUp = new TopUpAccount(service);
        Thread withdrawing = new Withdraw(service);
        toppingUp.start();
        withdrawing.start();
        toppingUp.join();
        withdrawing.join();
        System.out.println("We spent all the money!");
    }
}

