package interviewQuestions.Hard;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Top3FrequentWords4 {
    public static void main(String[] args) {
        String paragraph = "Java is is is great great great is. Java is object oriented. Java streams streams streams are powerful, and Java is fun!";

        Map<String, Long> map = Arrays.stream(
                paragraph.toLowerCase()
                        .replaceAll("[^a-z\\s]", "")
                        .split(" ")
        ).collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
        ));
        System.out.println(map);

        List<Map.Entry<String, Long>> sorted = map.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .toList();
        System.out.println(sorted);
        List<Long> topFrequency = sorted.stream()
                .map(Map.Entry::getValue)
                .distinct()
                .limit(3)
                .toList();
        System.out.println(topFrequency);

        List<Map.Entry<String, Long>> list = sorted.stream()
                .filter(e -> topFrequency.contains(e.getValue()))
                .toList();
        System.out.println(list);



        List<Map.Entry<String, Long>> mymap = Arrays.stream(paragraph.toLowerCase().replaceAll("[^a-z\\s]", "").split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 2)
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(3)
                .toList();
        System.out.println(map);



    }
}
