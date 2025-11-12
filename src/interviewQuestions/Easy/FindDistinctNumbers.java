package interviewQuestions.Easy;

import java.util.Arrays;
import java.util.List;

public class FindDistinctNumbers {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5, 5, 5};

        List<Integer> distinctNumbers = Arrays.stream(numbers).distinct().boxed().toList();
        System.out.println("Distinct numbers using streams: " + distinctNumbers);
    }
}
