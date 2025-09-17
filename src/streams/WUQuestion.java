package streams;

import java.util.stream.Collectors;

public class WUQuestion {
    public static void main(String[] args) {
        String str = "aaaabBbCCDd";

        str.chars().mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet()
                .stream()
                .forEach((entry )-> System.out.print(entry.getKey().toString()+entry.getValue()));
        System.out.println();

        str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c,Collectors.counting()))
                .forEach((k, v) -> System.out.print(k.toString() + v));


//        str.chars().mapToObj(c->(char)c).collect(Comparable.class);
    }
}
