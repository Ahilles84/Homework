package task_5.planes;

import task_5.enums.TypeOfEngine;

public abstract class Airplane extends Aircraft {
  private TypeOfEngine typeOfEngine;

  public Airplane(
      String name,
      String registrationNumber,
      int rangeOfFlight,
      int cruisingSpeed,
      TypeOfEngine typeOfEngine) {
    super(name, registrationNumber, rangeOfFlight, cruisingSpeed);
    this.typeOfEngine = typeOfEngine;
  }

  public TypeOfEngine getTypeOfEngine() {
    return typeOfEngine;
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
            + this.getTypeOfEngine());
  }
}
