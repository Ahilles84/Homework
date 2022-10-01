package task_8;

public class ATM {
    public static void topUpAccount(Card card, int depositAmount){
        if(card.checkPIN()) {
            card.setAccount(card.getAccount() + depositAmount);
        } else {
            throw new IllegalArgumentException("Wrong PIN");
        }
    }
    public static void cashWithdrawal(Card card, int withdrawalAmount){
        if(card.checkPIN()) {
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
        Card debitCard = new Card(1234, 0);
        topUpAccount(debitCard, 1000);
        System.out.println(debitCard.getAccount());
        cashWithdrawal(debitCard, 550);
        System.out.println(debitCard.getAccount());
    }
}
