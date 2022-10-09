package task_9;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TextStatistics {
    public static int punctCounter(String text){
        int punctuationMarks = 0;
        Matcher matcher;
        Pattern punctuation = Pattern.compile("\\p{Punct}");
        String[] words = text.split("\\s");
        for(String str: words) {
            matcher = punctuation.matcher(str);
            while (matcher.find()) {
                ++punctuationMarks;
            }
        }
        return punctuationMarks;
    }
    public static int wordCounter(String text){
        String[] words = text.split(" ?[.,?!-]? +");
        return words.length;
    }

    public static void createFileFromConsoleInput(String fileName){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))){
            String text;
            while (!(text = br.readLine()).equals("END")){
                bw.write(text + "\n");
                bw.flush();
            }
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    public static String textFromFile(String fileName){
        StringBuilder textFromFile = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String str;
            while ((str = br.readLine())!= null) {
                textFromFile.append(str).append("\n");
            }
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return textFromFile.toString();
    }

    public static void main(String[] args){
        createFileFromConsoleInput("New_file.txt");
        String example = textFromFile("New_file.txt");
        System.out.println(example);
        System.out.println("Number of words: " + wordCounter(example));
        System.out.println("Number of punctuation marks: " + punctCounter(example));
    }
}
