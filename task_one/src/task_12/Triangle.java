package task_12;

import task_12.impl.Shape;
import task_12.impl.Validatable;

public class Triangle implements Shape, Validatable {
    private double height;
    private double base;
    private final ShapeType shapeType = ShapeType.TRIANGLE;

    public Triangle() {}

    public Triangle(double height, double base) {
        validator(height);
        validator(base);
        this.height = height;
        this.base = base;
    }

    public void setHeight(double height) {
        validator(height);
        this.height = height;
    }

    public void setBase(double base) {
        validator(base);
        this.base = base;
    }

    @Override
    public double findArea() {
        return base * height / 2;
    }

    @Override
    public String toString() {
        return "Figure is = " + shapeType + ", base = " + base + ", height = " + height;
    }


    public void validator(double measure) {
        if (measure <= 0) throw new IllegalArgumentException("Measurement must not be negative or zero!");
    }
}
