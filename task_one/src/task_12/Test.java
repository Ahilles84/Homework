package task_12;

import task_12.impl.Shape;

import static task_12.factory.ShapeFactory.createFigure;

public class Test {
    public static void main(String[] args) {
        try {
            //с фабрикой:

            Shape circle1 = createFigure(ShapeType.CIRCLE, 2.54);
            Shape triangle1 = createFigure(ShapeType.TRIANGLE, 14.52, 24.85);
            Shape rectangle1 = createFigure(ShapeType.RECTANGLE, 102.54, 458.7402);

            System.out.println(circle1 + ", area = " + circle1.findArea());
            System.out.println(triangle1 + ", area = " + triangle1.findArea());
            System.out.println(rectangle1 + ", area = " + rectangle1.findArea());
            System.out.println();

            //традиционный способ:

            Shape circle2 = new Circle(25);
            Shape triangle2 = new Triangle(24, 74.2);
            Shape rectangle2 = new Rectangle(12.4, 70.801);

            System.out.println(circle2 + ", area = " + circle2.findArea());
            System.out.println(triangle2 + ", area = " + triangle2.findArea());
            System.out.println(rectangle2 + ", area = " + rectangle2.findArea());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
