package task_8;

public class CreditCard extends Card{
    private int limit;

    public CreditCard(int pin, int limit) {
        super(pin);
        this.limit = limit;
    }
    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public void setAccount(int account) {
        if(account < -getLimit()){
            throw new IllegalArgumentException("Not enough money");
        }
        super.setAccount(account);
    }
}
