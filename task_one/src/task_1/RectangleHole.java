package task_1;

import static task_1.ServiceClass.validate;

public class RectangleHole {
  private double height;
  private double width;

  public RectangleHole(double height, double width) {
    validate(height);
    validate(width);
    this.height = height;
    this.width = width;
  }

  public double findDiagonal() {
    return Math.sqrt(height * height + width * width);
  }
}
