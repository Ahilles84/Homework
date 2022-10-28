package task_12;

public class Circle implements Shape{
    private double radius;
    private final ShapeType shapeType = ShapeType.CIRCLE;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
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
}
