package task_1;

public class RoundPlug {
    private double radius;
    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Measurements can't be negative or zero!");
        }
        this.radius = radius;
    }
    public double getDiameter () {
        return radius * 2;
    }
}
