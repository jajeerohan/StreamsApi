package interviewQuestions.Easy;

import java.util.Arrays;
import java.util.List;

public class AverageOfNumbers {

    public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 8, 10};
        double average = Arrays.stream(numbers).average().getAsDouble();
        System.out.println("Average: " + average);

        List<Integer> numberList = List.of(1, 3, 5, 7, 9);
        double averageList = numberList.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("Average from list: " + averageList);

    }

}
