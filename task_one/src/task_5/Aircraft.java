package task_5;

public abstract class Aircraft implements Cargo,Passenger{

    private String name;
    private String registrationNumber;

    private int rangeOfFlight;
    private int cruisingSpeed;

    public Aircraft(String name,String registrationNumber, int rangeOfFlight, int cruisingSpeed) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.rangeOfFlight = rangeOfFlight;
        this.cruisingSpeed = cruisingSpeed;
    }

    public String getName() {
        return name;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public int getRangeOfFlight() {
        return rangeOfFlight;
    }
    public int getCruisingSpeed() {
        return cruisingSpeed;
    }
    public void showAircraftSpec() {
        System.out.println(" Technical specifications of " + this.getName() + ": \n" +
                "Registration number: " + this.getRegistrationNumber() + "\n" +
                "Range: " + this.getRangeOfFlight() + " meters; \n" +
                "Cruising speed: " + this.getCruisingSpeed() + " km/h; \n");
    }
    @Override
    public String toString() {
        return name + "{Range of flight: " + rangeOfFlight +
                "km., cruising speed: " + cruisingSpeed +
                "km/h., registration number: " + registrationNumber + '\'' +
                '}';
    }
}
