package streams;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeStreams {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Alice", 30, "HR", 50000),
            new Employee("Bob", 25, "IT", 60000),
            new Employee("Charlie", 35, "Finance", 70000),
            new Employee("David", 28, "IT", 55000),
            new Employee("Eve", 32, "HR", 52000)
        );

        // Example: Filter employees older than 30 and sort by salary
        employees.stream().filter(e->e.getAge()>30).forEach(System.out::println);

        // Example: Get a list of employee sorted by age
        employees.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);

//        System.out.println(lst.toString());



    }
}
