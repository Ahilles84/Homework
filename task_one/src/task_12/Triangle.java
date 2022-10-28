package task_12;

public class Triangle implements Shape, Validator {
    private double height;
    private double base;
    private final ShapeType shapeType = ShapeType.TRIANGLE;

    public double getHeight() {
        return height;
    }

    public Triangle() {
    }

    public Triangle(double height, double base) {
        validator(height, base);
        this.height = height;
        this.base = base;
    }

    public void setHeight(double height) {
        validator(height);
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        validator(base);
        this.base = base;
    }

    public ShapeType getShapeType() {
        return this.shapeType;
    }

    @Override
    public double findArea() {
        return base * height / 2;
    }

    @Override
    public String toString() {
        return "Figure is = " + shapeType;
    }

    @Override
    public void validator(double... measurements) {
        if (base <= 0 || height <= 0) throw new IllegalArgumentException("Measurement must not be negative or zero!");
    }
}
