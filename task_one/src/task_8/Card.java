package task_8;

public abstract class Card {
    private final int PIN;
    private int account;

    public Card(int pin){
        this.PIN = pin;
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


