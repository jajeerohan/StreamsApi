package interviewQuestions.Intermediate;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentCharacter10 {
    public static void main(String[] args) {
        String input = "bananannna";
        String[] chars = input.split("");
        Arrays.stream(chars).forEach(System.out::print);
        System.out.println();

        //  "banana" → ['b', 'a', 'n', 'a', 'n', 'a']

        //find the count of each character
        Map<Character, Long> map = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        //find the character with the max count
        Map.Entry<Character, Long> characterLongEntry = map.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();
        System.out.println(characterLongEntry);


        // Alternative approach - both grouping and max in single stream
        String mostFrequentCharacter = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(x->x, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(x -> x.getKey())
                .get();

        System.out.println(mostFrequentCharacter);
    }
}
