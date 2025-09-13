package streams;

import java.util.ArrayList;
import java.util.List;
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

        List<Integer> lst2 = lst.stream()
                .collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getKey().longValue() == e.getValue())
                .map(e->e.getKey())
                .collect(Collectors.toList());

        System.out.println(lst2);
    }
}
