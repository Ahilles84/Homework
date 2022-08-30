package main;

public class Rectangle {
    static double height;
    static double width;
    static double diagonal;
    public void setWidth(double width) {
        Rectangle.width = width;
    }
    public void setHeight(double height) {
        Rectangle.height = height;
    }
    public double countDiagonal (){
        diagonal = Math.sqrt(height*height + width*width);
        return diagonal;
    }
}
