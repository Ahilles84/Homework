package task_5;

public abstract class Helicopter extends Aircraft{
    private RotorSystem rotorSystem;

    public Helicopter(String name, String registrationNumber, int rangeOfFlight, int cruisingSpeed, RotorSystem rotorSystem) {
        super(name, registrationNumber, rangeOfFlight, cruisingSpeed);
        this.rotorSystem = rotorSystem;
    }

    public RotorSystem getRotorSystem() {
        return rotorSystem;
    }
    @Override
    public void showAircraftSpec() {
        System.out.println("Technical specifications of " + this.getName() + ": \n" +
                "Registration number: " + this.getRegistrationNumber() + "\n" +
                "Range: " + this.getRangeOfFlight() + " meters; \n" +
                "Cruising speed: " + this.getCruisingSpeed() + " km/h; \n" +
                "Rotor system : " + this.getRotorSystem());
    }
}
