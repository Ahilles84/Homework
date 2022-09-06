package main;

public class Compare {
    public static void main (String[] args) {
        Rectangle hole = new Rectangle();
        hole.setHeight(1.2);
        hole.setWidth(6);
        RoundPlug plug = new RoundPlug();
        plug.setRadius(2.54);
        if (hole.countDiagonal() <= plug.countDiameter()) {
            System.out.println(plug.countDiameter() + " > " + hole.countDiagonal() + ", so the hole is closed!");
        } else {
            System.out.println(hole.countDiagonal() + " > " + plug.countDiameter() + ", so it seems we need bigger plug!");
        }
    }
}
