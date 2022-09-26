package task_5;

public abstract class Airplane extends Aircraft{
    private TypeOfEngine typeOfEngine;

    public Airplane(int rangeOfFlight, int cruisingSpeed, String registrationNumber, TypeOfEngine typeOfEngine) {
        super(rangeOfFlight, cruisingSpeed, registrationNumber);
        this.typeOfEngine = typeOfEngine;
    }

    public TypeOfEngine getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(TypeOfEngine typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public Airplane(int rangeOfFlight, int cruisingSpeed, String registrationNumber) {
        super(rangeOfFlight, cruisingSpeed, registrationNumber);
    }

    @Override
    public abstract int getCarryingCapacity();
    @Override
    public abstract int getPassengerCapacity();
}
