package task_5;

public class BusinessJet extends Airplane{
    private int passengerCapacity;
    private boolean internetAvailability;
    private boolean showerAvailability;

    public BusinessJet(int rangeOfFlight, int cruisingSpeed, String registrationNumber, TypeOfEngine typeOfEngine, int passengerCapacity, boolean internetAvailability, boolean showerAvailability) {
        super(rangeOfFlight, cruisingSpeed, registrationNumber, typeOfEngine);
        if(passengerCapacity <= 0){
            throw new IllegalArgumentException("These parameters can't be negative or zero!");
        }
        this.passengerCapacity = passengerCapacity;
        this.internetAvailability = internetAvailability;
        this.showerAvailability = showerAvailability;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public boolean isInternetAvailability() {
        return internetAvailability;
    }

    public void setInternetAvailability(boolean internetAvailability) {
        this.internetAvailability = internetAvailability;
    }

    public boolean isShowerAvailability() {
        return showerAvailability;
    }

    public void setShowerAvailability(boolean showerAvailability) {
        this.showerAvailability = showerAvailability;
    }

    @Override
    public TypeOfEngine getTypeOfEngine() {
        return super.getTypeOfEngine();
    }

    @Override
    public RotorSystem getRotorSystem() {
        return null;
    }

    @Override
    public int getCarryingCapacity() {
        return 0;
    }
}
