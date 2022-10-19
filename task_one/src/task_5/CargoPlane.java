package task_5;

public class CargoPlane extends Airplane implements Cargo{
    private int carryingCapacity;

    public CargoPlane(String name, String registrationNumber, int rangeOfFlight, int cruisingSpeed, TypeOfEngine typeOfEngine, int carryingCapacity) {
        super(name, registrationNumber, rangeOfFlight, cruisingSpeed, typeOfEngine);
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public int getCarryingCapacity() {
        return this.carryingCapacity;
    }

    @Override
    public int getPassengerCapacity() {
        return 0;
    }
}
