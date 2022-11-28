package task_2;

public class SumOfDigitsInHalves {
  public static int sumOfDigitsInFirstHalf(String number) {
    int sumOfDigits = 0;
    int[] firstHalfDigits = new int[number.length() / 2];
    for (int i = 0; i < firstHalfDigits.length; i++) {
      firstHalfDigits[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
      sumOfDigits += firstHalfDigits[i];
    }
    return sumOfDigits;
  }

  public static int sumOfDigitsInSecondHalf(String number) {
    int sumOfDigits = 0;
    int[] secondHalfDigits = new int[number.length() / 2];
    for (int i = secondHalfDigits.length - 1; i >= 0; i--) {
      secondHalfDigits[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
      sumOfDigits += secondHalfDigits[i];
    }
    return sumOfDigits;
  }
}
