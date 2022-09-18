package task_3;

import java.util.Arrays;

public class PrimeArrayCreator {
    public static int[] PrimeArray(int[] source) {
        int[] temp = new int[source.length];
        int k = 0;
        for (int i = source[source.length - 1]; i > 0; i--) {
            int countDividers = 0;
            for (int j = i; j > 0; j--) {
                if (i % j == 0) {
                    countDividers++;
                    if (countDividers > 2) {
                        break;
                    }
                }
            }
            if (countDividers <= 2) {
                temp[k] = i;
                k++;
            }
        }
        int countPrimeNumbers = 0;
        for (int val : temp) {
            if (val > 1) {
                countPrimeNumbers++;
            }
        }
        int[] primeArray = Arrays.copyOf(temp, countPrimeNumbers);
        Arrays.sort(primeArray);
        return primeArray;
    }
}
