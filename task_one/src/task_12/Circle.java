package task_12;

import task_12.impl.Shape;
import task_12.impl.Validatable;

public class Circle implements Shape, Validatable {
    private double radius;
    private final ShapeType shapeType = ShapeType.CIRCLE;

    public Circle(double radius) {
        validator(radius);
        this.radius = radius;
    }

    public Circle() {}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        validator(radius);
        this.radius = radius;
    }
    public ShapeType getShapeType() {
        return this.shapeType;
    }


    @Override
    public double findArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Figure is = " + shapeType;
    }

    @Override
    public void validator(double... measurements) {
        if(radius<=0) throw new IllegalArgumentException("Measurement must not be negative or zero!");
    }
}
