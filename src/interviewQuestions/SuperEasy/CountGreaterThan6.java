package interviewQuestions.SuperEasy;

import java.util.List;

public class CountGreaterThan6 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 5, 7, 9, 11, 13, 15);

        long count = numbers.stream()
                .filter(x->x>6)
                .count();

        System.out.println(count);
    }
}
