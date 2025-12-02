package interviewQuestions.Easy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordInString {
    public static void main(String[] args) {
        String name = "Hello World from ChatGPT";

        String sentence = Arrays.stream(name.split(" "))
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(sentence);

        String sentence2 = Arrays.stream(name.split(" "))
                .reduce("", (a, b) -> b + " " + a);

        System.out.println(sentence2);
    }
}
