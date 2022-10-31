package task_12.impl;

public interface Shape{
    double findArea();

    default void setHeight(double height){}
    default void setBase(double base){}
    default void setRadius(double radius){}

}
