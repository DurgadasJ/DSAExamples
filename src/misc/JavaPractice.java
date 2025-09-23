package misc;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;

public class JavaPractice {
    public static void main(String[] args) {
        String str = "aaabbcdde";

        Map<Character,Long> map = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()));

        for(char ch: str.toCharArray()){
            if(map.get(ch)==1){
                System.out.println(ch);
                break;
            }
        }

        str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().forEach(e-> System.out.print(e.getKey()+ "" + e.getValue()));
        System.out.println();
        str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()==1).limit(1).forEach(e-> System.out.println(e.getKey()));

        Predicate<String> pre = sr ->sr.length()>5;
        System.out.println(pre.test(str));

        Supplier<Boolean> st = () ->str.length()>5;

        System.out.println(st.get());

        List<Integer> lst = List.of(1,2,2,3,4,4,4,4);

        Map<Integer,Long> map1 =lst.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));
        System.out.println(map1);

        lst.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .entrySet().stream().filter(e->e.getKey().longValue()==e.getValue()).forEach(e-> System.out.println(e));

        System.out.println(lst.stream().collect(Collectors.groupingBy(e->e%2==0 ? "EvenSum" : "OddSum",Collectors.summingInt(e->e))).toString());
        System.out.println(lst.stream().collect(Collectors.groupingBy(e->e%2==0 ? "even" : "odd")).toString());
        int totalSum =lst.stream().filter(e->e%2==0).mapToInt(Integer::intValue).sum();
        int diff = lst.stream().filter(e->e%2==0).mapToInt(Integer::intValue).sum()
                - lst.stream().filter(e->e%2!=0).mapToInt(Integer::intValue).sum();
        System.out.println("Total Sum : " + totalSum + "\n Diff : "+ diff);
    }
}
