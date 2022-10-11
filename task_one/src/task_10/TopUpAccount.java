package task_10;

public class TopUpAccount extends Thread{
    private final CardholderService service;
    public TopUpAccount (CardholderService service){
        this.service = service;
    }
    @Override
    public void run(){
        while(service.getAccount() != 0){
            service.topUpAccount();
            System.out.println(service.getAccount());
            Thread.yield();
        }
    }
}
