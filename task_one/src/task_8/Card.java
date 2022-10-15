package task_8;

public abstract class Card {
    private final int pin;
    private int account;

    public Card(int pin){
        this.pin = pin;
    }
    public int getPin() {
        return pin;
    }
    public int getAccount() {
        return account;
    }
    public void setAccount(int account) {
        this.account = account;
    }
}


