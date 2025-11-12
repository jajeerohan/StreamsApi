package interviewQuestions.Easy;

import java.util.Arrays;

public class FirstNonEmptyString {

    public static void main(String[] args) {
        String[] strings = {"", "", "Hello", "World", ""};

        String firstNonEmptyString = Arrays.stream(strings).filter(x->!x.isEmpty()).findFirst().get();

        System.out.println(firstNonEmptyString);
    }

}
