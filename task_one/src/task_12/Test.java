package task_12;

public class Test {
    public static void main(String[] args) {
        ShapeFactory circles = new CircleCreator();
        ShapeFactory triangles = new TriangleCreator();

        Circle figure = (Circle) circles.createFigure();
        figure.setRadius(4.25);
        System.out.println(figure + " " + figure.findArea());

        Triangle anotherFigure = (Triangle) triangles.createFigure();
        anotherFigure.setBase(14.358);
        anotherFigure.setHeight(12.5);
        System.out.println(anotherFigure + " " + anotherFigure.findArea());
    }
}
