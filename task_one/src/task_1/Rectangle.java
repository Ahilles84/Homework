package task_1;

public class Rectangle {
    private double height;
    private double width;
    private double diagonal;
    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Measurements can't be negative or zero!");
        }
        this.width = width;
    }
    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Measurements can't be negative or zero!");
        }
        this.height = height;
    }
    public double getDiagonal (){
        diagonal = Math.sqrt(height*height + width*width);
        return diagonal;
    }
}
