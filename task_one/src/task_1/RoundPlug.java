package task_1;

import static task_1.ServiceClass.validate;

public class RoundPlug {
  private double radius;

  public RoundPlug(double radius) {
    validate(radius);
    this.radius = radius;
  }

  public double findDiameter() {
    return radius * 2;
  }
}
