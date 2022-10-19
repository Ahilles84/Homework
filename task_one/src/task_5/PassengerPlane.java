package task_5;

public class PassengerPlane extends Airplane implements Passenger{
    private int passengerCapacity;

    public PassengerPlane(String name, String registrationNumber, int rangeOfFlight, int cruisingSpeed, TypeOfEngine typeOfEngine, int passengerCapacity) {
        super(name, registrationNumber, rangeOfFlight, cruisingSpeed, typeOfEngine);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public int getPassengerCapacity() {
        return this.passengerCapacity;
    }

    @Override
    public int getCarryingCapacity() {
        return 0;
    }
}
