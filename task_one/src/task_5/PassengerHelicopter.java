package task_5;

public class PassengerHelicopter extends Helicopter{
    private int passengerCapacity;

    public PassengerHelicopter(int rangeOfFlight, int cruisingSpeed, String registrationNumber, RotorSystem rotorSystem, int passengerCapacity) {
        super(rangeOfFlight, cruisingSpeed, registrationNumber, rotorSystem);
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
    public TypeOfEngine getTypeOfEngine() {
        return null;
    }

    @Override
    public int getCarryingCapacity() {
        return 0;
    }
}
