package task_3;

public class ArrayCreator {
    public static int[] fillArray(int firstElem, int step, int arraySize){
        int [] basicArr = new int[arraySize];
        for(int i = 0; i < arraySize; i++){
            basicArr[i] = firstElem;
            firstElem = firstElem + step;
        }
        return basicArr;
    }
    public static void printFirstAndLastElem(int array[]) {
        System.out.println("[" + array[0] + " ... " + array[array.length-1] + "]");
    }

}
