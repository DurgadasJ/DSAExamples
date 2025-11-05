package string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

//import static java.util.stream.Nodes.collect;

public class SampleCode1 {
    public static void main(String[] args) {
        String input = "springboot";

        Optional<Map.Entry<Character, Long>> ch3 = input.chars().mapToObj(c->(char) c).collect(Collectors
                        .groupingBy(c-> c, LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()==1).findFirst();

        System.out.println(ch3 );

        Map<Character,Integer> map = new HashMap<>();
        for(char c : input.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);

        }

        Map<Integer,Integer> map1 = new HashMap<>();

        map1.put(1,63);
        map1.put(2,23);
        map1.put(3,53);

        System.out.println(map1.entrySet().stream().min(Map.Entry.comparingByValue()));

        map1.entrySet()
                .stream()
                .min(Map.Entry.comparingByValue())
                .ifPresent(e -> System.out.println(e.getKey()));


//        for(int i=0;i<input.length();i++){
//            char ch = input.charAt(i);
//            if(map.containsKey(ch)){
//                map.put(ch,map.get(ch)+1);
//            }else{
//                map.put(ch,1);
//            }
//        }
        System.out.println(map.toString());
        for(char ch :input.toCharArray()){
            if(map.get(ch)==1){
                System.out.println(ch);
                break;
            }
        }


//        for(int i=0;i<input.length();i++){
//            char ch = input.charAt(i);
//            if(map.get(ch)==1){
//                System.out.println(ch);
//                break;
//            }
//        }



//                collect(Collectors.gntroupingBy(c->c), Collectors.counting()).filter(k-> k.getValue()==1).findFirst();

//        input.chars().map

    }
}