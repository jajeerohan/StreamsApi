package interviewQuestions.Easy;

import java.util.Comparator;
import java.util.List;

public class SortNumbers3 {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(5, 3, 8, 1, 2, 7);

        List<Integer> ascendingOrder = numbers.stream().sorted().toList();
        System.out.println("Ascending order: " + ascendingOrder);

        List<Integer> descendingOrder = numbers.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Descending order: " + descendingOrder);

        List<Integer> descendingOrderLambda = numbers.stream()
                .sorted((a, b) -> b - a)
                .toList();
        System.out.println("Descending order using lambda: " + descendingOrderLambda);

    }

}
