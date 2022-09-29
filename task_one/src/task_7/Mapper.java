package task_7;

import java.util.HashMap;
import java.util.Map;

public class Mapper <K>{
    public static <K> Map<K, Integer> arrayToMap(K[] ks) {
        Map<K, Integer> map = new HashMap<>();
        for (int i = 0; i < ks.length; i++) {
            map.put(ks[i],i+1);
        }
        return map;
    }

    public static void main(String[] args){
        String[] twelveMonths = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Map<String, Integer> calendar = arrayToMap(twelveMonths);
        System.out.println(calendar.toString());
    }
}
