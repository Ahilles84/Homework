package task_8;

import java.util.Scanner;

public class ATM {
    public static boolean checkPIN(Card card){
        System.out.println("Please enter PIN code");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        if (userInput != card.getPIN()){
            throw new IllegalArgumentException("Wrong PIN");
        }
        return userInput == card.getPIN();
    }
    public static void topUpAccount(Card card, int depositAmount){
        if(ATM.checkPIN(card)){
            card.setAccount(card.getAccount() + depositAmount);
        }
    }
    public static void cashWithdrawal(Card card, int withdrawalAmount){
        if(ATM.checkPIN(card)) {
            card.setAccount(card.getAccount() - withdrawalAmount);
        }
    }
    public static void main(String[] args){
        try {
            Card visa = new DebitCard(1234);
            Card mastercard = new CreditCard(4545,10000);
            topUpAccount(visa, 2000);
            System.out.println(visa.getAccount());
            cashWithdrawal(visa, 100);
            System.out.println(visa.getAccount());
            topUpAccount(mastercard, 1000);
            System.out.println(mastercard.getAccount());
            cashWithdrawal(mastercard, 10550);
            System.out.println(mastercard.getAccount());
        } catch (IllegalArgumentException ex){
            System.err.println(ex.getMessage());
        } finally {
            System.out.println("Have a nice day!");
        }
    }
}
