package task_7;

import java.util.HashMap;
import java.util.Map;

public class Mapper <K>{
    public static <K> Map<K, Integer> arrayToMap(K[] ks) {
        Map<K, Integer> map = new HashMap<>();
        for (K k : ks) {
            int value = 0;
            for (K item : ks) {
                if (k.equals(item)) {
                    value++;
                }
            }
            map.put(k, value);
        }
        return map;
    }

    public static void main(String[] args){
        String text = "Listen to the news from today and read the text at the same time. Listen to the news from today without reading the text. ";
        String[] words = text.split(" ?[.,?!-]? +");
        Map<String, Integer> myMapOne = arrayToMap(words);
        System.out.println(myMapOne);
        Double[] numbers = new Double[]{1.2, 15.0, 24.55, 0.554, 1.3, 4.502, 8521.2554, 1.2, 0.554};
        Map<Double, Integer> myMapTwo = arrayToMap(numbers);
        System.out.println(myMapTwo);
    }
}
