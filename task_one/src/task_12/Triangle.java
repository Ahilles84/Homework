package task_12;

public class Triangle implements Shape{
    private double height;
    private double base;
    private ShapeType shapeType = ShapeType.TRIANGLE;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public ShapeType getShapeType() {
        return shapeType;
    }

    @Override
    public double findArea() {
        return base * height / 2;
    }

    @Override
    public String toString() {
        return "{" +
                "shapeType=" + shapeType +
                '}';
    }
}
