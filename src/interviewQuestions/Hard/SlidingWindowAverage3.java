package interviewQuestions.Hard;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SlidingWindowAverage3 {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(4, 8, 15, 16, 23, 42);

        int windowSize = 2;

        List<Double> list = IntStream.range(0, input.size()-(windowSize-1))
                .mapToObj(i -> input.subList(i, i+windowSize))
                .map(window -> window.stream()
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0.0)
                ).toList();

        System.out.println("Sliding window averages computed " + list);

    }
}
