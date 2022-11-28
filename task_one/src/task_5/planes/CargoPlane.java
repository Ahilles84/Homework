package task_5.planes;

import task_5.enums.TypeOfEngine;
import task_5.impl.Cargo;

public class CargoPlane extends Airplane implements Cargo {
  private int carryingCapacity;

  public CargoPlane(
      String name,
      String registrationNumber,
      int rangeOfFlight,
      int cruisingSpeed,
      TypeOfEngine typeOfEngine,
      int carryingCapacity) {
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
