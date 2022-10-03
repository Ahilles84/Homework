package task_8;

import java.util.Scanner;

public class ATM {
    public static boolean checkPIN(Card card){
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        return userInput == card.getPIN();
    }
    public static void topUpAccount(Card card, int depositAmount){
        if(ATM.checkPIN(card)) {
            card.setAccount(card.getAccount() + depositAmount);
        } else {
            throw new IllegalArgumentException("Wrong PIN");
        }
    }
    public static void cashWithdrawal(Card card, int withdrawalAmount){
        if(ATM.checkPIN(card)) {
            if (card.getAccount() >= withdrawalAmount) {
                card.setAccount(card.getAccount() - withdrawalAmount);
            } else {
                throw new IllegalArgumentException("Not enough money");
            }
        } else {
            throw new IllegalArgumentException("Wrong PIN");
        }
    }

    public static void main(String[] args){
        try {
            Card debitCard = new Card(1234, 0);
            topUpAccount(debitCard, 1000);
            System.out.println(debitCard.getAccount());
            cashWithdrawal(debitCard, 1550);
            System.out.println(debitCard.getAccount());
        } catch (IllegalArgumentException ex){
            System.err.println(ex);
        }
    }
}
