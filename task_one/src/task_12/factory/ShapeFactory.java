package task_12.factory;

import task_12.Circle;
import task_12.impl.Shape;
import task_12.ShapeType;
import task_12.Triangle;

public class ShapeFactory {
    public static Shape createFigure(ShapeType shapeType){
        switch(shapeType){
            case CIRCLE: return new Circle();
            case TRIANGLE: return new Triangle();
            default: throw new IllegalArgumentException("Wrong shape type!");
        }
    }
}
