package main;

public class Compare {
    public static void main (String[] args) {
        Rectangle one = new Rectangle();
        one.setHeight(1.2);
        one.setWidth(6);
        RoundPlug two = new RoundPlug();
        two.setRadius(2.54);
        if (one.countDiagonal() <= two.countDiameter()) {
            System.out.println(two.countDiameter() + " > " + one.countDiagonal() + ", so the hole is closed!");
        } else {
            System.out.println(one.countDiagonal() + " > " + two.countDiameter() + ", so it seems we need bigger plug!");
        }
    }
}
