package task_1;

public class Test {
  public static void main(String[] args) {
    ServiceClass serviceClass = new ServiceClass();
    System.out.println(
        serviceClass.ifPlugCloseHole(new RoundPlug(12.54), new RectangleHole(7.45, 3.579)));
  }
}
