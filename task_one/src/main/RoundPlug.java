package main;

public class RoundPlug {
    static double radius;
    static double diameter;
    public void setRadius(double radius) {
        RoundPlug.radius = radius;
    }
    public double countDiameter () {
        diameter = radius * 2;
        return diameter;
    }
}
