package main;

public class Rectangle {
    static double height;
    static double width;
    static double diagonal;
    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Measurments can't be negative or zero!");
        }
        Rectangle.width = width;
    }
    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Measurments can't be negative or zero!");
        }
        Rectangle.height = height;
    }
    public double countDiagonal (){
        diagonal = Math.sqrt(height*height + width*width);
        return diagonal;
    }
}
