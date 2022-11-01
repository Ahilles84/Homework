package task_12.factory;

import task_12.Circle;
import task_12.Rectangle;
import task_12.ShapeType;
import task_12.Triangle;
import task_12.impl.Shape;

public class ShapeFactory {
    public static Shape createFigure(ShapeType shapeType, double... measurement) {
        switch (shapeType) {
            case CIRCLE:
                Shape circle = new Circle();
                circle.setRadius(measurement[0]);
                return circle;
            case TRIANGLE:
                Shape triangle = new Triangle();
                triangle.setBase(measurement[0]);
                triangle.setHeight(measurement[1]);
                return triangle;
            case RECTANGLE:
                Shape rectangle = new Rectangle();
                rectangle.setWidth(measurement[0]);
                rectangle.setLength(measurement[1]);
                return rectangle;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
