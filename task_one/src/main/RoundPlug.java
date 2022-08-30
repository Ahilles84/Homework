package main;

public class RoundPlug {
    static double radius;
    static double diameter;
    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Measures can't be negative or zero!");
        }
        RoundPlug.radius = radius;
    }
    public double countDiameter () {
        diameter = radius * 2;
        return diameter;
    }
}
