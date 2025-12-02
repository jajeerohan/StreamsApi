package interviewQuestions.Hard;



import interviewQuestions.Intermediate.dto.Employee;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostCommonFirstLetter {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1,"John", "IT", 60000),
                new Employee(2,"Alice", "HR", 55000),
                new Employee(3,"Bob", "IT", 75000),
                new Employee(4,"Carol", "HR", 70000),
                new Employee(5,"David", "Finance", 65000),
                new Employee(6,"Eve", "IT", 80000),
                new Employee(7,"Frank", "Finance", 64000),
                new Employee(8,"Ala", "Operations", 44000),
                new Employee(9,"Jackson", "Operations", 44000),
                new Employee(10,"Jacob", "Operations", 44000)
        );

        //Step-1: Create a list of all the first letters of employee names
        List<String> firstLetters = employees.stream()
                .map(emp -> emp.getName().substring(0, 1))
                .toList();
        System.out.println(firstLetters);

        //Step-2: Find occurrence of each first letter
        Map<String, Long> map = firstLetters.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

        //Step-3: Find the most occurred first letter from the map
        String mostOccurredFirstLetter = map.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .get();
        System.out.println("Most occurred first letter is: " + mostOccurredFirstLetter);

        //Step-4: Combine all 3 steps into one
        String mostCommonFirstLetter = employees.stream()
                .map(emp -> emp.getName().substring(0, 1))
                .collect(Collectors.toList())
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .get();
        System.out.println("Most common first letter is: " + mostCommonFirstLetter);



    }
}
