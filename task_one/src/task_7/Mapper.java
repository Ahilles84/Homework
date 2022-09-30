package task_7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Mapper <K>{
    public static <K> Map<K, Integer> arrayToMap(K[] ks) {
        Map<K, Integer> map = new HashMap<>();
        for (int i = 0; i < ks.length; i++) {
            int value = 0;
            for(int j = 0; j < ks.length; j++){
                if (ks[i].equals(ks[j])){
                    value++;
                }
            }
            map.put(ks[i],value);
        }
        return map;
    }

    public static void main(String[] args){
        String text = "Listen to the news from today and read the text at the same time. Listen to the news from today without reading the text. ";
        String[] words = text.split(" ?[.,?!-]? +");
        Map<String, Integer> calendar = arrayToMap(words);
        System.out.println(calendar.toString());
    }
}
