package task_12;

public class Circle implements Shape{
    private double radius;
    private ShapeType shapeType = ShapeType.CIRCLE;

    public ShapeType getShapeType() {
        return shapeType;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "{" +
                "shapeType=" + shapeType +
                '}';
    }
}
