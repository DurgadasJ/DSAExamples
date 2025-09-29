package streams;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NumberRepetition {
    public static void main(String[] args) {

        List<Integer> lst = List.of(1,2,2,3,4,4,4,4,5,5,5,5,5,6,6,6);
//        lst.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()))
//                .forEach((k,v)-> System.out.println(k + " is repeated " + v + " times"));

        lst.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .forEach((k,v)-> {
                    if(v == k.longValue()){
                        System.out.println(k + " is repeated " + v + " times");
                    }
                });

        List<Integer> lst2 = lst.parallelStream()
                .collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getKey().longValue() == e.getValue())
                .map(e->e.getKey())
                .collect(Collectors.toList());

        // Using sequential stream
        // The output will be same as lst2
        // But lst2 may be faster for large list because of parallel processing
        // However, for small list, the overhead of parallel processing may make it slower
        // So, it's better to use sequential stream for small list
        // Here, the list is small, so we can use sequential stream
        List<Integer> lst3 = lst.stream()
                .collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getKey().longValue() == e.getValue())
                .map(e->e.getKey())
                .collect(Collectors.toList());

        System.out.println(lst2);
        System.out.println(lst3);

        String str = "IntelliijIdea";

        str.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(c->c, Collectors.counting())).
                forEach((c,v)->System.out.println(c.toString() + " -> " + v));

        // Print only characters that are repeated twice
        str.chars().mapToObj(c->(char)c ).collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()==2).forEach(e->System.out.println(e.getKey()));

        // Print only non-repeating characters
        //  Use LinkedHashMap to maintain the order of characters
        System.out.println("Non-repeating character:");
        str.chars().mapToObj(c->(char)c ).collect(Collectors.groupingBy(c->c, LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()==1).findFirst().ifPresent(e->System.out.println(e.getKey()));

        // Print first repeating character
        // Use LinkedHashMap to maintain the order of characters
        System.out.println("First repeating character:");
        str.chars().mapToObj(c->(char)c ).collect(Collectors.groupingBy(c->c, LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()!=1).findFirst().ifPresent(e->System.out.println(e.getKey()));

        // can we write print in filter give example
        System.out.println("First repeating character with print in filter:");
        str.chars().mapToObj(c->(char)c ).collect(Collectors.groupingBy(c->c, LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(e->{
                    System.out.println("Checking character: " + e.getKey() + " with count: " + e.getValue());
                    return e.getValue()!=1;
                }).findFirst().ifPresent(e->System.out.println(e.getKey()));
    }
}
