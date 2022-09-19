package task_4;

import java.util.Arrays;

public class UniqueWords {
    public static int uniqueWordsCounter (String sourceText) {
        String[] words = sourceText.split(" ?[.,?!-]? +");
        int uniqueCounter = 0;
        for (String word : words) {
            int hitCounter = 0;
            for (String anotherWord : words) {
                if (word.equalsIgnoreCase(anotherWord)) {
                    hitCounter++;
                }
            }
            if (hitCounter == 1) {
                uniqueCounter++;
            }
        }
        return uniqueCounter;
    }
    public static void main (String[] args){
        String text = "Периодически в новостях всплывают вакансии, о которых только можно мечтать. В реальности некоторые из них оказываются маркетинговым ходом - компаниям нужно ваше внимание, а ваша трудовая книжка - нет. Попробуйте угадать, какие из этих вакансий существовали в действительности. ";
        String engText = "Listen to the news from today and read the text at the same time. Listen to the news from today without reading the text. ";
        System.out.println(Arrays.toString(text.split(" ?[,.!?-]? +")));
        System.out.println(Arrays.toString(engText.split(" ?[,.!?-]? +")));
        System.out.println(uniqueWordsCounter(text));
        System.out.println(uniqueWordsCounter(engText));
    }
}