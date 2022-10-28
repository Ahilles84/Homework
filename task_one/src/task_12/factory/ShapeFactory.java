package task_12.factory;

import task_12.Circle;
import task_12.Shape;
import task_12.ShapeType;
import task_12.Triangle;

public class ShapeFactory implements Shape {
    public static Shape createFigure(ShapeType shapeType){
        if (shapeType == ShapeType.CIRCLE) {
            return new Circle();
        } else {
            return new Triangle();
        }
    }
    @Override
    public double findArea() {
        throw new UnsupportedOperationException();
    }
}
