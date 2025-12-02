package interviewQuestions.Intermediate;

import interviewQuestions.Intermediate.dto.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListOfEmployeesBySalary1 {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"John", "HR", 50000),
                new Employee(2,"Jane", "IT", 70000),
                new Employee(3,"Mike", "IT", 80000),
                new Employee(4,"Sara", "Finance", 60000),
                new Employee(5,"Paul", "HR", 55000)
        );

        List<Employee> sortBySalaryAscending = employees.stream()
            .sorted(Comparator.comparing(Employee::getSalary))
            .toList();
        System.out.println("Employees sorted by salary in ascending order: " + sortBySalaryAscending);

        List<Employee> sortBySalaryDescending = employees.stream()
            .sorted(Comparator.comparing(Employee::getSalary).reversed())
            .toList();
        System.out.println("Employees sorted by salary in descending order: " + sortBySalaryDescending);

        // Create comparator without method reference
        Comparator<Employee> salaryAscending = (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary());
        Comparator<Employee> salaryDescending = (e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary());

        List<Employee> sortBySalaryAscending1 = employees.stream()
                .sorted(salaryAscending)
                .toList();
        System.out.println("Employees sorted by salary in ascending order: " + sortBySalaryAscending1);

        List<Employee> sortBySalaryDescending1 = employees.stream()
                .sorted(salaryDescending)
                .toList();
        System.out.println("Employees sorted by salary in descending order: " + sortBySalaryDescending1);
    }
}
