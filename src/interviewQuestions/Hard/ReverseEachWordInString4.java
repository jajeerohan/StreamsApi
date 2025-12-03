package interviewQuestions.Hard;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordInString4 {
    public static void main(String[] args) {
        String name = "Hello World from ChatGPT";

        // reverse each word in the string using string builder
        String sentence = Arrays.stream(name.split(" "))
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(sentence);

        // reverse each word in the string without using string builder
        String sentence2 = Arrays.stream(name.split(" "))
                .map(word -> Arrays.stream(word.split(""))
                        .reduce("", (a, b) -> b + a)
                ).collect(Collectors.joining(" "));
        System.out.println(sentence2);

        // print the string in reverse order using reduce but without reversing each word
        String sentence3 = Arrays.stream(name.split(" "))
                .reduce("", (a, b) -> b + " " + a);

        System.out.println(sentence3);
    }
}
