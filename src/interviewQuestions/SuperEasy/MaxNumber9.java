package interviewQuestions.SuperEasy;

import java.util.Arrays;

public class MaxNumber9 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 11, 13, 15};

        int max1 = Arrays.stream(numbers)
                .max()
                .getAsInt();

        int max2 = Arrays.stream(numbers)
                .reduce(0, (a, b)-> Math.max(a, b));

        System.out.println(max1);
        System.out.println(max2);
    }
}
