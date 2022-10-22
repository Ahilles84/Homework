package task_10;

import task_8.Card;

public class Service {
    private final Card debitCard;

    public int getAccount() {
        return debitCard.getAccount();
    }
    public Service(Card debitCard, int startAmount) {
        this.debitCard = debitCard;
        debitCard.setAccount(startAmount);
    }
    public synchronized void topUpAccount(int increasingValue) {
        debitCard.setAccount(debitCard.getAccount() + increasingValue);
    }

    public synchronized void withdraw(int reducingValue) {
        debitCard.setAccount(debitCard.getAccount() - reducingValue);
    }
}
