package task_12;

public class TriangleCreator extends ShapeFactory{

    @Override
    public double findArea() {
        return 0;
    }

    @Override
    public Shape createFigure() {
        return new Triangle();
    }
}
