package task_5.planes;

import task_5.enums.TypeOfEngine;
import task_5.impl.Passenger;

public class BusinessJet extends Airplane implements Passenger {
  private int passengerCapacity;
  private boolean internetAvailability;
  private boolean showerAvailability;

  public BusinessJet(
      String name,
      String registrationNumber,
      int rangeOfFlight,
      int cruisingSpeed,
      TypeOfEngine typeOfEngine,
      int passengerCapacity,
      boolean internetAvailability,
      boolean showerAvailability) {
    super(name, registrationNumber, rangeOfFlight, cruisingSpeed, typeOfEngine);
    this.passengerCapacity = passengerCapacity;
    this.internetAvailability = internetAvailability;
    this.showerAvailability = showerAvailability;
  }

  public boolean isInternetAvailable() {
    return internetAvailability;
  }

  public boolean isShowerAvailable() {
    return showerAvailability;
  }

  @Override
  public void showAircraftSpec() {
    System.out.println(
        "Technical specifications of "
            + this.getName()
            + ": \n"
            + "Registration number: "
            + this.getRegistrationNumber()
            + "\n"
            + "Range: "
            + this.getRangeOfFlight()
            + " meters; \n"
            + "Cruising speed: "
            + this.getCruisingSpeed()
            + " km/h; \n"
            + "Type of engine: "
            + this.getTypeOfEngine()
            + "\n"
            + "Internet: "
            + (this.isInternetAvailable() ? "Yes" : "No")
            + "\n"
            + "Shower on board: "
            + (this.isShowerAvailable() ? "Yes" : "No"));
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
