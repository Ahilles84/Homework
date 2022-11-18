package task_1;

public class ServiceClass {
  public static void validate(double measurement) {
    if (measurement <= 0)
      throw new IllegalArgumentException("Measurements can't be negative or zero!");
  }

  public boolean ifPlugCloseHole(RoundPlug plug, RectangleHole hole) {
    return (hole.findDiagonal() <= plug.findDiameter());
  }
}
