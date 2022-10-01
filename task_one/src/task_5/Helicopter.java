package task_5;

public abstract class Helicopter extends Aircraft{
    private RotorSystem rotorSystem;

    public Helicopter(int rangeOfFlight, int cruisingSpeed, String registrationNumber, RotorSystem rotorSystem) {
        super(rangeOfFlight, cruisingSpeed, registrationNumber);
        this.rotorSystem = rotorSystem;
    }


    public RotorSystem getRotorSystem() {
        return rotorSystem;
    }

    public void setRotorSystem(RotorSystem rotorSystem) {
        this.rotorSystem = rotorSystem;
    }

    @Override
    public abstract int getCarryingCapacity();

    @Override
    public abstract int getPassengerCapacity();
}
