package task_5.planes;

import task_5.enums.RotorSystem;
import task_5.impl.Cargo;

public class CargoHelicopter extends Helicopter implements Cargo {
  private int carryingCapacity;

  public CargoHelicopter(
      String name,
      String registrationNumber,
      int rangeOfFlight,
      int cruisingSpeed,
      RotorSystem rotorSystem,
      int carryingCapacity) {
    super(name, registrationNumber, rangeOfFlight, cruisingSpeed, rotorSystem);
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
