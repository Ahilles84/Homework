package task_11;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    String str1 = "a1";
    String str2 = "a2";
    String str3 = "a3";
    String str4 = "b1";
    String str5 = "b3";
    String str6 = "c2";
    String str7 = "c1";
    String str8 = "c5";
    List<String> myList = List.of(str1, str2, str3, str4, str5, str6, str7, str8);
    String output =
        myList.stream()
            .filter(str -> !str.contains("3"))
            .sorted(Comparator.comparingInt(str -> str.charAt(1)))
            .sorted(((o1, o2) -> o2.charAt(0) - o1.charAt(0)))
            .skip(1)
            .map(str -> str.replace("1", "9"))
            .map(String::toUpperCase)
            .collect(Collectors.joining("; "));
    System.out.println(output);
  }
}
