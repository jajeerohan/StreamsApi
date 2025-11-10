package interviewQuestions.SuperEasy;

import java.util.IntSummaryStatistics;
import java.util.List;

public class EvenSquaredSum10 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int sumOfEvenSquares = numbers.stream()
                .filter(x->x%2==0)
                .map(x->x*x)
                .reduce(0, (a,b)->a+b);

        int sum = numbers.stream()
                .filter(x->x%2==0)
                .map(x->x*x)
                .reduce(0, Integer::sum);


        System.out.println(sumOfEvenSquares);
        System.out.println(sum);
    }
}
