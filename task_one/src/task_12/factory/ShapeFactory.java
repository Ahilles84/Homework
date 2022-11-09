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
                return new Circle(measurement[0]);
            case TRIANGLE:
                return new Triangle(measurement[0], measurement[1]);
            case RECTANGLE:
                return new Rectangle(measurement[0], measurement[1]);
            default:
                throw new UnsupportedOperationException();
        }
    }
}
