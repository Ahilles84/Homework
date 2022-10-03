package task_8;

import java.util.Scanner;

public class Card {
    private final int PIN;
    private int account;

    public Card(int pin, int account){
        this.PIN = pin;
        this.account = account;
    }
    public int getPIN() {
        return PIN;
    }
    public int getAccount() {
        return account;
    }
    public void setAccount(int account) {
        this.account = account;
    }

}


