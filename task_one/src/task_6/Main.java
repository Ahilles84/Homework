package task_6;

public class Main {
  public static void main(String[] args) {
    Pair<String> pair = new Pair<>("First", "Second");
    System.out.println(pair.getFirst());
    System.out.println(pair.getLast());
    System.out.println(pair.replaceFirst("One"));
    System.out.println(pair.replaceLast("Two"));
    System.out.println(pair);
    pair.swap(pair);
    System.out.println(pair);
  }
}
