package InterviewPrep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class InterviewPrep {
    public static void main(String[] args){
        String str = "Interview Prep";

        str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c , Collectors.counting()))
                .forEach((k,v)-> System.out.print(k.toString()+v));
        System.out.println();
        //what to do if need to ignore space
        str.chars().mapToObj(c->(char)c)
                .filter(c->c!=' ')
                .collect(Collectors.groupingBy(c->c , Collectors.counting()))
                .forEach((k,v)-> System.out.print(k.toString()+v));

        //what to do if need to ignore case
        System.out.println();
        str.chars().mapToObj(c -> (char) c)
                .filter(c -> c != ' ')
                .map(e -> Character.toLowerCase(e))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .forEach((k,v)-> System.out.println(k+""+v));

        //need to find out first non-repeating character and print it
        System.out.println("first non-repeating character is :");
        str.chars().mapToObj(c->(char)c)
                .filter(c->c!=' ')
                .map(c->Character.toLowerCase(c))
                .collect(Collectors.groupingBy(c->c, LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(c->c.getValue()==1)
                .findFirst()
                .ifPresent(c-> System.out.println(c.getKey()));

        Map<Character,Integer> map = new LinkedHashMap<>();

        for(char c:str.toCharArray()){
            if(c==' ') continue;
            char ch = Character.toLowerCase(c);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());

            if(entry.getValue()==1){
                System.out.println("First non-repeating character is: "+ entry.getKey());
                break;
            }
        }
        Integer max = Integer.MIN_VALUE;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
            }
        }
        System.out.println("Maximum occurring character count is: "+ max);
        // to find maximum occurring character
        for(Map.Entry<Character,Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println("Maximum occurring character is: " + entry.getKey());
                break;
            }
        }
    }
}
