package interviewQuestions.Easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 5, 8, 12, 7, 15, 3);

        int secondHighest = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("Second highest number: " + secondHighest);

    }

}
