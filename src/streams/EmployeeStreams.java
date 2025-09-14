package streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeStreams {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Alice", 30, "HR", 50000,"Bob"),
            new Employee("Bob", 25, "IT", 60000,"David"),
            new Employee("Charlie", 35, "Finance", 70000 , "David"),
            new Employee("David", 28, "IT", 55000,"Eve"),
            new Employee("Eve", 32, "HR", 52000,"Bob")
        );

        // Example: Filter employees older than 30 and sort by salary
        employees.stream().filter(e->e.getAge()>30).forEach(System.out::println);

        // Example: Get a list of employee sorted by age
        employees.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);

        // Example: Get a set of highest salary per departments
        employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDept,Collectors.maxBy(Comparator.comparing(Employee::getSalary))
                        ))
                .forEach((k,v)-> System.out.println(k + " : " + v.get()));

        // List of employee reporting to same manager
        Map<String,List<String>> map=employees.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getManager,Collectors.mapping(
                                        Employee::getName,
                                        Collectors.toList())));
        System.out.println(map.toString());
        // Only need to get name of employee who has manager david
        employees.stream().filter(e->e.getManager()=="David").map(Employee::getName).forEach(System.out::println);

        // List of employees who are not managers
        employees.stream().
                filter(e->employees.stream().noneMatch(emp->emp.getManager().equals(e.getName())))
                .forEach(System.out::println);

        //list of employees who are managers
        // employees.stream().
        // filter(e->employees.stream()
        // .anyMatch(emp->emp.getManager().equals(e.getName()))).forEach(System.out::println);

        System.out.println(employees.stream().mapToDouble(Employee::getSalary).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst());

    }
}
