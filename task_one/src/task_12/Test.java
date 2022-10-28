package task_12;

import static task_12.factory.ShapeFactory.createFigure;

public class Test {
    public static void main(String[] args) {

        //с фабрикой:

        Circle figure1 = (Circle) createFigure(ShapeType.CIRCLE);
        Triangle figure2 = (Triangle) createFigure(ShapeType.TRIANGLE);
        figure1.setRadius(1.25478);
        figure2.setHeight(10.204);
        figure2.setBase(54.871);
        System.out.println(figure1 + ", area = " + figure1.findArea());
        System.out.println(figure2 + ", area = " + figure2.findArea());

        //традиционный способ:

        Shape figure3 = new Circle(25);
        Shape figure4 = new Triangle(24,74.2);
        System.out.println(figure3 + ", area = " + figure3.findArea());
        System.out.println(figure4 + ", area = " + figure4.findArea());
    }
}
