package task_12.factory;

import task_12.Circle;
import task_12.Rectangle;
import task_12.ShapeType;
import task_12.Triangle;
import task_12.impl.Shape;


public class ShapeFactory {
    public static Shape createFigure(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE:
                return new Circle();
            case TRIANGLE:
                return new Triangle();
            case RECTANGLE:
                return new Rectangle();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
