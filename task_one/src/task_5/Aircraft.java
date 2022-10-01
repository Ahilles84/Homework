package task_5;

public abstract class Aircraft {
    private int rangeOfFlight;
    private int cruisingSpeed;
    private String registrationNumber;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Aircraft(int rangeOfFlight, int cruisingSpeed, String registrationNumber) {
        if (rangeOfFlight <= 0 || cruisingSpeed <= 0){
            throw new IllegalArgumentException("These parameters can't be negative or zero!");
        }
        this.rangeOfFlight = rangeOfFlight;
        this.cruisingSpeed = cruisingSpeed;
        this.registrationNumber = registrationNumber;
    }

    public int getRangeOfFlight() {
        return rangeOfFlight;
    }

    public void setRangeOfFlight(int rangeOfFlight) {
        this.rangeOfFlight = rangeOfFlight;
    }

    public int getCruisingSpeed() {
        return cruisingSpeed;
    }

    public void setCruisingSpeed(int cruisingSpeed) {
        this.cruisingSpeed = cruisingSpeed;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public abstract TypeOfEngine getTypeOfEngine();
    public abstract RotorSystem getRotorSystem();
    public abstract int getCarryingCapacity();
    public abstract int getPassengerCapacity();

    @Override
    public String toString() {
        return name + "{Range of flight: " + rangeOfFlight +
                "km., cruising speed: " + cruisingSpeed +
                "km/h., registration number: " + registrationNumber + '\'' +
                '}';
    }
}
