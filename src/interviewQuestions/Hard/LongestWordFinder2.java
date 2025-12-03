package interviewQuestions.Hard;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWordFinder2 {
    public static void main(String[] args) {
        String sentence = "The quick, brown fox jumped over the lazy dog!";

        String longestWord = Arrays.stream(sentence.toLowerCase()
                        .replaceAll("[^a-z\\s]", "")
                        .split(" "))
                .max((word1, word2) -> Integer.compare(word1.length(), word2.length()))
                .get();
        System.out.println("The longest word is: " + longestWord);

        String s = Arrays.stream(
                        sentence.toLowerCase()
                                .replaceAll("[^a-z\\s]", "")
                                .split(" ")
                ).max(Comparator.comparing(String::length))
                .orElse("");
        System.out.println(s);

    }
}
