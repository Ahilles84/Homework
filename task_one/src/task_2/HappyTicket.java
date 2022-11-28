package task_2;
public class HappyTicket {
  public static void main(String[] args) {
    String maxNumberOfPack = "9990999";
    int number = Integer.parseInt(maxNumberOfPack);
    int happyCounter = 0;
    while (number > 0) {
      int tailSum = 0;
      int headSum = 0;
      int tempNum = number;
      for (int i = 0; i < maxNumberOfPack.length() / 2; i++) {
        tailSum = tailSum + tempNum % 10;
        tempNum = tempNum / 10;
      }
      for (int j = 0; j < maxNumberOfPack.length() / 2; j++) {
        headSum = headSum + tempNum % 10;
        tempNum = tempNum / 10;
      }
      if (headSum == tailSum) {
        happyCounter++;
      }
      number--;
    }
    System.out.println("We'll need " + happyCounter + " souvenirs!");
  }
}
