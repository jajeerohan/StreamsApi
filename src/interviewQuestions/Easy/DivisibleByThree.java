package interviewQuestions.Easy;

import java.util.Arrays;
import java.util.List;

public class DivisibleByThree {

    public static void main(String[] args) {
        int[] numbers = {3, 5, 9, 12, 15, 22, 27, 30, 33, 40};

        List<Integer> divisibleByThree = Arrays.stream(numbers).filter(x->x%3==0).boxed().toList();
        System.out.println("Numbers divisible by 3: " + divisibleByThree);

        List<Integer> numbersList = Arrays.asList(3, 5, 7, 10, 14);
        boolean match = numbersList.stream().anyMatch(n -> n % 3 == 0);
        System.out.println(match);
    }

}
