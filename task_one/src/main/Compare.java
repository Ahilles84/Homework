package main;

public class Compare {
    public static void main (String[] args) {
        Rectangle one = new Rectangle();
        one.setHeight(4);
        one.setWidth(6);
        RoundPlug two = new RoundPlug();
        two.setRadius(7);
        if (one.countDiagonal() <= two.countDiameter()) {
            System.out.println("The hole is closed!");
        } else {
            System.out.println("Need bigger plug!");
        }
    }
}
