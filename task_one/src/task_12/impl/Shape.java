package task_12.impl;

public interface Shape {
    double findArea();

    default void setHeight(double height) {
        throw new UnsupportedOperationException();
    }

    default void setBase(double base) {
        throw new UnsupportedOperationException();
    }

    default void setRadius(double radius) {
        throw new UnsupportedOperationException();
    }

    default void setWidth(double width) {
        throw new UnsupportedOperationException();
    }

    default void setLength(double length) {
        throw new UnsupportedOperationException();
    }
}
