package task_10;

public class TopUpAccount extends Thread{
    private final Service service;
    public TopUpAccount (Service service){
        this.service = service;
    }
    @Override
    public void run(){
        while(service.getAccount() != 0){
            service.topUpAccount(3);
            System.out.println(service.getAccount());
            Thread.yield();
        }
    }
}
