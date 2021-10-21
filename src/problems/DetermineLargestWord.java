package problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);

        System.out.println("Word length from the sentence is " + wordNLength);
        System.out.println("Largest word from the sentence is " + largestWord(s));

    }

    public static Map<Integer, String> findTheLargestWord(String givenWord) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";

        String[] sep = givenWord.split(" ");

        for (int i = 0; i < sep.length; i++) {
            map.put(sep[i].length(), sep[i]);
        }
        return map;
    }

    public static String largestWord(String givenWord) {
        DetermineLargestWord dt = new DetermineLargestWord();
        Map<Integer, String> wordNLength = dt.findTheLargestWord(givenWord);
        int largest = 0;
        String largeValue = "";
        for (Map.Entry<Integer, String> checkLength : wordNLength.entrySet()) {
            if (largest < checkLength.getKey()) {
                largest = checkLength.getKey();
                largeValue = checkLength.getValue();
            }
        }
        return largeValue;
    }
}