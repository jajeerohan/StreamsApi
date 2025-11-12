package interviewQuestions.Easy;

import java.util.Arrays;
import java.util.List;

public class FlattenList {

    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );
        //1,2,3,4,5,6,7,8

        List<Integer> flatMap = listOfLists.stream().flatMap(List::stream).toList();
        System.out.println(flatMap);
    }

}
