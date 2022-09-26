package task_5;

public class CargoHelicopter extends Helicopter{
    private int carryingCapacity;

    @Override
    public TypeOfEngine getTypeOfEngine() {
        return null;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }
    public CargoHelicopter(int rangeOfFlight, int cruisingSpeed, String registrationNumber, RotorSystem rotorSystem, int carryingCapacity) {
        super(rangeOfFlight, cruisingSpeed, registrationNumber, rotorSystem);
        if(carryingCapacity <= 0){
            throw new IllegalArgumentException("These parameters can't be negative or zero!");
        }
        setCarryingCapacity(carryingCapacity);
    }
    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public RotorSystem getRotorSystem() {
        return super.getRotorSystem();
    }

    @Override
    public int getPassengerCapacity() {
        return 0;
    }
}
