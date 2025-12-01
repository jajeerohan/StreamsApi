package interviewQuestions.Intermediate;

import interviewQuestions.dto.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageAgeInAList2 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 28),
                new Person("David", 35)
        );

        double averageAge1 = people.stream()
                .mapToInt(x->x.getAge())
                .average()
                .getAsDouble();
        System.out.println("Average Age: " + averageAge1);


        double averageAge2 = people.stream()
                .collect(Collectors.averagingInt(x -> x.getAge()));
        System.out.println("Average Age: " + averageAge2);

        double averageAge3 = people.stream()
                .reduce(0.0,
                        (sum, person) -> sum + person.getAge(),
                        (sum1, sum2) -> sum1 + sum2) / people.size();
        System.out.println("Average Age: " + averageAge3);


    }

}
