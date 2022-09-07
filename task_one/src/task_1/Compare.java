package task_1;

public class Compare {
    public static void main (String[] args) {
        Rectangle hole = new Rectangle();
        hole.setHeight(1.2);
        hole.setWidth(6);
        RoundPlug plug = new RoundPlug();
        plug.setRadius(2.54);
        if (hole.getDiagonal() <= plug.getDiameter()) {
            System.out.println(plug.getDiameter() + " > " + hole.getDiagonal() + ", so the hole is closed!");
        } else {
            System.out.println(hole.getDiagonal() + " > " + plug.getDiameter() + ", so it seems we need bigger plug!");
        }
    }
}
