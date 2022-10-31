package task_12;

import task_12.impl.Shape;

import static task_12.factory.ShapeFactory.createFigure;

public class Test {
    public static void main(String[] args) {
        try {
            //с фабрикой:

            Shape circle1 = createFigure(ShapeType.CIRCLE);
            Shape triangle1 = createFigure(ShapeType.TRIANGLE);
            Shape rectangle1 = createFigure(ShapeType.RECTANGLE);
            circle1.setRadius(1.25478);
            triangle1.setHeight(7.258);
            triangle1.setBase(54.871);
            rectangle1.setLength(25.3);
            rectangle1.setWidth(45.3);
            System.out.println(circle1 + ", area = " + circle1.findArea());
            System.out.println(triangle1 + ", area = " + triangle1.findArea());
            System.out.println(rectangle1 + ", area = " + rectangle1.findArea());

            //традиционный способ:

            Shape circle2 = new Circle(25);
            Shape triangle2 = new Triangle(24, 74.2);
            System.out.println(circle2 + ", area = " + circle2.findArea());
            System.out.println(triangle2 + ", area = " + triangle2.findArea());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
