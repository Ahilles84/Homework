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
        //System.out.println(Arrays.toString(basicArr));

        int[] negativeArr = Arrays.copyOf(basicArr, basicArr.length / 2);
        //System.out.println(Arrays.toString(negativeArr));

        int[] positiveArr = new int [basicArr.length/2];
        System.arraycopy(basicArr, 100001, positiveArr, 0, basicArr.length / 2);
        //System.out.println(Arrays.toString(positiveArr));

        int[] temp = new int[basicArr.length];
        int k = 0;
        for (int i = basicArr[basicArr.length-1]; i > 0; i--) {
            int countDiv = 0;
            for (int j = i; j > 0; j--) {
                if (i % j == 0) {
                    countDiv++;
                    if (countDiv > 2){
                        break;
                    }
                }
            }
            if (countDiv <= 2) {
                temp[k] = i;
                k++;
            }
        }
        int countPrime = 0;
        for (int val:temp) {
            if (val > 1){
                countPrime++;
            }
        }
        int[] primeArray = Arrays.copyOf(temp, countPrime);
        Arrays.sort(primeArray);
        System.out.println("There are " + countPrime + " prime numbers in our primeArray.");
        System.out.println(Arrays.toString(primeArray));
    }
}
