package interviewQuestions.Intermediate;

import interviewQuestions.dto.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentWithMoreThanXEmployees8 {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1,"John", "IT", 60000),
                new Employee(2,"Alice", "HR", 55000),
                new Employee(3,"Bob", "IT", 75000),
                new Employee(4,"Carol", "HR", 70000),
                new Employee(5,"David", "Finance", 65000),
                new Employee(6,"Eve", "IT", 80000),
                new Employee(7,"Frank", "Finance", 64000),
                new Employee(8,"Ala", "Operations", 44000)
        );

        //this returns a map of department and count of employees in that department
        Map<String, Long> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(map);

        //now apply filter to get departments with more than 1 employee
        List<String> listOfDepartments = map.entrySet().stream()
                .filter(x-> x.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();

        //or you can do it in one go as below
        List<String> list = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(list);
    }
}
