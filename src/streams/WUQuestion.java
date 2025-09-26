package streams;

import java.util.*;
import java.util.function.Function;
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

        System.out.println();
        String str1 = "sasdsd";
        Map<Character, Long> map =str1.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));

        for(char ch: str1.toCharArray()){
            if(map.get(ch)==1){
                System.out.println(ch);
                break;
            }
        }
        String str2 = "zsdsdsdsa";
//        Map<Character, Long> map1 =

        System.out.println(str2.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c->c, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e->e.getValue()==1).findFirst());

//        for (char ch : str2.toCharArray()) {
//            if (map1.get(ch) == 1) {
//                System.out.println(ch);
//                break;
//            }
//        }
//        str.chars().mapToObj(c->(char)c).collect(Comparable.class);
    }
}
