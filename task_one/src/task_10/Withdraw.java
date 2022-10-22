package task_10;

public class Withdraw extends Thread{
    private final Service service;
    public Withdraw (Service service){
        this.service = service;
    }
    @Override
    public void run(){
        while(service.getAccount() != 0){
            if (service.getAccount() >= 5) {
                service.withdraw(5);
                System.out.println(service.getAccount());
                Thread.yield();
            }
        }
    }
}
