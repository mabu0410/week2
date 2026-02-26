package collection;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        String text = "Java la ngon ngu lap trinh java manh me " +
                "java duoc dung nhieu trong lap trinh web";

        String[] words = text.split("\\s+");

        Map<String, Integer> count = new HashMap<>();

        for (String word : words){
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        System.out.println(count);
    }

}
