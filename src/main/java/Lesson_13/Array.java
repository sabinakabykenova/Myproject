package Lesson_13;
import java.util.*;

public class Array {
    public static void main(String[] args) {
        // Массив с набором слов
        String[] words = {"apple", "banana", "orange", "apple", "banana", "kiwi", "kiwi", "grape", "apple"};

        //  Set для получения уникальных слов
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println("Уникальные слова: " + uniqueWords);

        // Количество вхождений каждого слова
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println("Количество вхождений каждого слова: " + wordCount);
    }
}
