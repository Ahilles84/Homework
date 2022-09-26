package task_5;

public class CargoPlane extends Airplane{
    private int carryingCapacity;

    public CargoPlane(int rangeOfFlight, int cruisingSpeed, String registrationNumber, TypeOfEngine typeOfEngine, int carryingCapacity) {
        super(rangeOfFlight, cruisingSpeed, registrationNumber, typeOfEngine);
        if(carryingCapacity <= 0){
            throw new IllegalArgumentException("These parameters can't be negative or zero!");
        }
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public RotorSystem getRotorSystem() {
        return null;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }
    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }
    @Override
    public int getPassengerCapacity() {
        return 0;
    }

}
