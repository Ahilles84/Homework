package task_8;

import java.util.Scanner;

public class CardholderService implements AutoCloseable {
    public static boolean checkPIN(Card card){
        System.out.println("Please enter PIN code");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        if (userInput != card.getPin()){
            throw new IllegalArgumentException("Wrong PIN");
        }
        return userInput == card.getPin();
    }
    public void topUpAccount(Card card, int depositAmount){
        if(CardholderService.checkPIN(card)){
            card.setAccount(card.getAccount() + depositAmount);
        }
    }
    public void cashWithdrawal(Card card, int withdrawalAmount){
        if(CardholderService.checkPIN(card)) {
            card.setAccount(card.getAccount() - withdrawalAmount);
        }
    }

    @Override
    public void close() throws Exception {
    }
}
