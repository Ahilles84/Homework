package task_8;

public class DebitCard extends Card{
    public DebitCard(int pin) {
        super(pin);
    }

    @Override
    public int getPIN() {
        return super.getPIN();
    }

    @Override
    public int getAccount() {
        return super.getAccount();
    }

    @Override
    public void setAccount(int account) {
        if(account < 0){
            throw new IllegalArgumentException("Not enough money");
        }
        super.setAccount(account);
    }
}
