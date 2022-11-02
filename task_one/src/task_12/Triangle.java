package task_12;

import task_12.impl.Shape;
import task_12.impl.Validatable;

public class Triangle implements Shape, Validatable {
    private final ShapeType shapeType = ShapeType.TRIANGLE;
    private double height;
    private double base;

    public Triangle(double height, double base) {
        validator(height);
        validator(base);
        this.height = height;
        this.base = base;
    }

    @Override
    public double findArea() {
        return base * height / 2;
    }

    @Override
    public String toString() {
        return "Figure = " + shapeType + ", base = " + base + ", height = " + height;
    }

}
