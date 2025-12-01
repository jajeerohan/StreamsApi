package interviewQuestions.Intermediate;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FistNonRepeatingCharacter11 {
    public static void main(String[] args) {
        String str = "swiss";

        // Using LinkedHashMap to maintain the order of characters as HashMap does not guarantee order
        Optional<Map.Entry<String, Long>> first = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(x->x, LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x->x.getValue()==1)
                .findFirst();

        System.out.println(first);
    }
}
