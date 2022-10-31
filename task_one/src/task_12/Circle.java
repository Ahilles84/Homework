package task_12;

import task_12.impl.Shape;
import task_12.impl.Validatable;

public class Circle implements Shape, Validatable {
    private final ShapeType shapeType = ShapeType.CIRCLE;
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        validator(radius);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        validator(radius);
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Figure is = " + shapeType + ", radius = " + radius;
    }
}
