package interviewQuestions.Intermediate;

import interviewQuestions.Intermediate.dto.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class HighestPaidEmpPerDepartment7 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"John", "HR", 50000),
                new Employee(2,"Jane", "IT", 70000),
                new Employee(3,"Mike", "IT", 80000),
                new Employee(4,"Sara", "Finance", 60000),
                new Employee(5,"Paul", "HR", 55000)
        );

        Map<String, Optional<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparing(employee -> employee.getSalary()))
                ));
        System.out.println(map);

    }
}
