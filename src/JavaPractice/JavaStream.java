package JavaPractice;

import java.util.*;
import java.util.stream.Collectors;

public class JavaStream {
    public static void main(String [] args){
        List<String> lst = new ArrayList<>();

        lst.add("John");
        lst.add("Inesh");
        lst.add("luc");

//        lst.stream().filter(s->s.length()>3).map(String::toUpperCase).forEach(System.out::println);

        List<Integer> salary = new LinkedList<>();
        salary.add(10000);
        salary.add(15000);
        salary.add(20000);

//        System.out.println(salary.stream().sorted(Comparator.reverseOrder()).limit(1).findFirst().orElse(1));
//        System.out.println(salary.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0));

        Set<String> set = new HashSet<>();
        set.add("John");
        set.add("Inesh");
        set.add("luc");
        set.add("John");
        set.stream().forEach(System.out::println);

        Set<Integer> setSalary = new LinkedHashSet<>();
        setSalary.add(10000);
        setSalary.add(15000);
        setSalary.add(20000);
        setSalary.add(10000);

        Set<Integer> sortedSet = setSalary.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(LinkedHashSet::new));
        setSalary.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(LinkedHashSet::new)).forEach(System.out::println);
        System.out.println(sortedSet);
    }
}

