package streams;

import java.util.*;
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
        //Intermediate and terminal operations
        // intermediate: filter, map, sorted, distinct, peek
        // terminal: forEach, collect, reduce, count, anyMatch, allMatch, noneMatch, findFirst, findAny
        // intermediate are lazy in nature
        // terminal are eager in nature
        // When terminal operation is invoked, all the intermediate operations are executed


        // java 25 features
        // has new features like stream().toList() instead of collect(Collectors.toList())
        // but collect is more powerful as it can be used to collect in different data structures like Set, Map etc.
        // collectors also provide various inbuilt collectors like groupingBy, partitioningBy, mapping, reducing etc.
        // Collectors.groupingBy is used to group the elements based on a classifier function

        //

        // Example: Get a set of highest salary per departments
       employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDept,Collectors.maxBy(Comparator.comparing(Employee::getSalary))
                        ))
                .forEach((k,v)-> System.out.println(k + " : " + v.get()));


       Map<String, Long> mapCount= employees.stream().collect(Collectors.groupingBy(Employee::getDept,
               Collectors.counting()));

        System.out.println(mapCount);
        // Find the department with the highest in mapCount
        String dept = mapCount.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

       // Count of employees in each department
        String dept1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()))
                 .entrySet().stream().max(Map.Entry.comparingByValue()).toString();

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

        System.out.println(employees.stream().max(Comparator.comparing(Employee::getSalary))
                .map(Employee::getName));

        System.out.println(employees.stream().max(Comparator.comparing(Employee::getSalary))
                .map(Employee::getName).toString());
    }

}
