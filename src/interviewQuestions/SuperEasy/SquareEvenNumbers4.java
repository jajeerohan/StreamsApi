package interviewQuestions.SuperEasy;

import java.util.List;

public class SquareEvenNumbers4 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> squaredEvens = numbers.stream()
                .filter(x->x%2==0)
                .map(x->x*x)
                .toList();

        System.out.println(squaredEvens);

    }
}
