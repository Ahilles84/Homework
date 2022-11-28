package task_6;

public class Pair<T> {
  private T first;
  private T last;

  public Pair(T first, T last) {
    this.first = first;
    this.last = last;
  }

  public T getFirst() {
    return first;
  }

  public T getLast() {
    return last;
  }

  public T replaceFirst(T newValue) {
    first = newValue;
    return first;
  }

  public T replaceLast(T newValue) {
    last = newValue;
    return last;
  }

  public Pair swap(Pair pair) {
    T temp = first;
    first = last;
    last = temp;
    return pair;
  }

  @Override
  public String toString() {
    return "[" + first + ", " + last + "]";
  }
}
