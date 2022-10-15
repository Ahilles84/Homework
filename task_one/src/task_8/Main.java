package task_8;

public class Main {
    public static void main(String[] args){
        try {
            Card visa = new DebitCard(1234);
            Card mastercard = new CreditCard(4545,10000);
            CardholderService atm1 = new CardholderService();
            atm1.topUpAccount(visa, 2000);
            System.out.println(visa.getAccount());
            atm1.cashWithdrawal(visa, 100);
            System.out.println(visa.getAccount());
            atm1.topUpAccount(mastercard, 1000);
            System.out.println(mastercard.getAccount());
            atm1.cashWithdrawal(mastercard, 10550);
            System.out.println(mastercard.getAccount());
        } catch (IllegalArgumentException ex){
            System.err.println(ex.getMessage());
        } finally {
            System.out.println("Have a nice day!");
        }
    }
}
