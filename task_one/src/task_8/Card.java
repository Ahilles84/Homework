package task_8;

import java.util.Scanner;

public class Card {
    private final int PIN;
    private int account;

    public Card(int pin, int account){
        this.PIN = pin;
        this.account = account;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }
    public boolean checkPIN(){
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        return userInput == PIN;
    }
}


