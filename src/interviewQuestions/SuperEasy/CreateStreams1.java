package interviewQuestions.SuperEasy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreams1 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("alice","bob");

        //1. List -> Stream
        Stream<String> stream = names.stream();

        String[] arr = {"Java", "Python", "C++"};

        //2. Array -> Stream
        Stream<String> stream1 = Arrays.stream(arr);

        //3. Stream of
        Stream<Integer> integerStream = Stream.of(1, 2, 3);

        //4. stream generate
        Stream<Double> limit = Stream.generate(Math::random).limit(5);

    }
}
