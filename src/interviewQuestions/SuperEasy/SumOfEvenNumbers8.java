package interviewQuestions.SuperEasy;

import java.util.List;

public class SumOfEvenNumbers8 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .filter(x->x%2==0)
                .reduce(0, (a,b)->a+b);

        System.out.println(sum);

    }
}
