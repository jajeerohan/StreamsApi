package interviewQuestions.Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurences5 {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Long> map = items.stream()
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));
        System.out.println(map);
    }
}
