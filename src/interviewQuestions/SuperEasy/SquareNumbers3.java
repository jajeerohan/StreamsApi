package interviewQuestions.SuperEasy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNumbers3 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        List<Integer> squares = numbers.stream()
                .map(x->x*x)
                .collect(Collectors.toList());

        System.out.println(squares); // Output: [1, 4, 9, 16, 25]

    }

}
