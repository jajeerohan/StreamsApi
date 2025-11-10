package interviewQuestions.SuperEasy;

import java.util.List;

public class FindFirstNumberGreaterThanTen5 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 8, 11, 12, 3, 20, 7);

        int greaterThanTen = numbers.stream()
                .filter(x->x>10)
                .sorted()
                .findFirst()
                .get();

        System.out.println(greaterThanTen);
    }
}
