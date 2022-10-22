package task_10;

public class Withdraw extends Thread{
    private final CardholderService service;
    public Withdraw (CardholderService service){
        this.service = service;
    }
    @Override
    public void run(){
        while(service.getAccount() != 0){
            if (service.getAccount() >= service.getReducingValue()) {
                service.withdraw();
                System.out.println(service.getAccount());
                Thread.yield();
            }
        }
    }
}
