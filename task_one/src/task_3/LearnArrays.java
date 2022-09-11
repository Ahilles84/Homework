package task_3;

import java.util.Arrays;

public class LearnArrays {
    public static void main (String[] args) {
        int[] basicArr = new int[200001];
        int element = -100000;
        for (int i = 0; i < basicArr.length; i++){
            basicArr[i] = element;
            element ++;
        }
        System.out.println("[" + basicArr[0] + " ... " + basicArr[basicArr.length-1] + "]");

        int[] negativeArr = Arrays.copyOf(basicArr, basicArr.length / 2);
        System.out.println("[" + negativeArr[0] + " ... " + negativeArr[negativeArr.length-1] + "]");

        int[] positiveArr = new int [basicArr.length/2];
        System.arraycopy(basicArr, 100001, positiveArr, 0, basicArr.length / 2);
        System.out.println("[" + positiveArr[0] + " ... " + positiveArr[positiveArr.length-1] + "]");

        int[] temp = new int[basicArr.length];
        int k = 0;
        for (int i = basicArr[basicArr.length-1]; i > 0; i--) {
            int countDividers = 0;
            for (int j = i; j > 0; j--) {
                if (i % j == 0) {
                    countDividers++;
                    if (countDividers > 2){
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
        for (int val:temp) {
            if (val > 1){
                countPrimeNumbers++;
            }
        }
        int[] primeArray = Arrays.copyOf(temp, countPrimeNumbers);
        Arrays.sort(primeArray);
        System.out.println("There are " + countPrimeNumbers + " prime numbers in our primeArray.");
        System.out.println(Arrays.toString(primeArray));
    }
}
