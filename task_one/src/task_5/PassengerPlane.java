package task_5;

public class PassengerPlane extends Airplane{
    private int passengerCapacity;

    public PassengerPlane(int rangeOfFlight, int cruisingSpeed, String registrationNumber, TypeOfEngine typeOfEngine, int passengerCapacity) {
        super(rangeOfFlight, cruisingSpeed, registrationNumber, typeOfEngine);
        if(passengerCapacity <= 0){
            throw new IllegalArgumentException("These parameters can't be negative or zero!");
        }
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
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
