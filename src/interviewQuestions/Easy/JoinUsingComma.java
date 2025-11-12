package interviewQuestions.Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinUsingComma {

    public static void main(String[] args) {
        String[] words = {"Hello", "World", "This", "Is", "Java"};
        String joinedWords = String.join(", ", words);
        System.out.println(joinedWords);


        String joinedWordsUsingStreams = Arrays.stream(words).collect(Collectors.joining(", "));
        System.out.println(joinedWordsUsingStreams);


        List<String> fruits = Arrays.asList("Apple", "Banana", "Mango", "Orange");
        String collect = fruits.stream()
                .collect(Collectors.joining(",","[","]"));
        System.out.println(collect);
    }

}
