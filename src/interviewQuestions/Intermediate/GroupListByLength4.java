package interviewQuestions.Intermediate;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupListByLength4 {

    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve", "Frank");

        Map<Integer, List<String>> map = names.stream()
                .collect(Collectors.groupingBy(name -> name.length()));
        System.out.println(map);
        for(Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
