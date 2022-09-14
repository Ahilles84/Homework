package task_3;

import java.util.Arrays;

public class TestDrive {
    public static void main(String[] args){
        int[] basicArray = ArrayCreator.fillArray(-100000,1,200001);
        ArrayCreator.printFirstAndLastElem(basicArray);

        int[] negativeArray = Arrays.copyOf(basicArray,basicArray.length / 2);
        ArrayCreator.printFirstAndLastElem(negativeArray);

        int[] positiveArray = new int[basicArray.length/2];
        System.arraycopy(basicArray, basicArray.length/2+1,positiveArray, 0, basicArray.length / 2);
        ArrayCreator.printFirstAndLastElem(positiveArray);

        int[] primeArr = PrimeArrayCreator.PrimeArray(basicArray);
        System.out.println("There are " + primeArr.length + " prime numbers in our primeArray.");
        System.out.println(Arrays.toString(primeArr));
    }
}
