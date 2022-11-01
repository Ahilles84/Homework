package task_12;

import task_12.impl.Shape;
import task_12.impl.Validatable;

public class Rectangle implements Shape, Validatable {
    private final ShapeType shapeType = ShapeType.RECTANGLE;
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        validator(length);
        validator(width);
        this.length = length;
        this.width = width;
    }

    @Override
    public void setWidth(double width) {
        validator(width);
        this.width = width;
    }

    @Override
    public void setLength(double length) {
        validator(length);
        this.length = length;
    }

    @Override
    public double findArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Figure = " + shapeType + ", length = " + length + ", width = " + width;
    }
}
