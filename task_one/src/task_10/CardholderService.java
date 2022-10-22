package task_10;

import task_8.DebitCard;

public class CardholderService {
    private final DebitCard debitCard;
    private final int increasingValue;
    private final int reducingValue;

    public int getIncreasingValue() {
        return increasingValue;
    }
    public int getReducingValue() {
        return reducingValue;
    }
    public int getAccount() {
        return debitCard.getAccount();
    }
    public CardholderService(DebitCard debitCard, int startAmount, int increasingValue, int reducingValue) {
        this.debitCard = debitCard;
        debitCard.setAccount(startAmount);
        this.increasingValue = increasingValue;
        this.reducingValue = reducingValue;
    }
    public synchronized void topUpAccount() {
        debitCard.setAccount(debitCard.getAccount() + increasingValue);
    }

    public synchronized void withdraw() {
        debitCard.setAccount(debitCard.getAccount() - reducingValue);
    }
}
