package string;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CharacterCount {
    public static void main(String[] args) {
        String str1 = "Welcome to Intellij Ideaa";
        String str = str1.toLowerCase();
        //how to remove spaces from string
        str.replace(" ","");
        // .replace() doesn't change the original string as strings are immutable in java
        // so we need to assign it to a new string or the same string variable
        str1 = "Welcome to Java Programming Language";
        // str1 will have the updated string now
        System.out.println(str1);
        System.out.println(str1.concat("!!!"));
        //      str1 will not change as concat also doesn't change the original string
        // we need to assign it to a new string or the same string variable
        // System.out.println(str1.concat("!!!")); this will print the output with !!!
        Map<Character,Integer> map = new ConcurrentHashMap<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                continue;
            }
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        System.out.println(map.toString()); // prints the map in key-value pairs
        System.out.println(map);// prints the map in key-value pairs

        // Map is an interface and HashMap is a class that implements the Map interface
        // here we are using Map interface to declare the map variable
        // and HashMap class to create the object of the map
        // This is done to achieve abstraction and loose coupling
        // We can change the implementation of the map to TreeMap or LinkedHashMap without changing the code
        // as long as we are using the Map interface to declare the map variable
        // This is a good practice to follow
        Map<Character,Integer> map1 = new HashMap<>();
        // iterate through each character of string
        for(char ch : str.toCharArray()){
            if(ch!= ' '){
                // If character is already present in map, increment its count by 1
                // If character is not present in map, add it to map with count 1
                map1.put(ch,map1.getOrDefault(ch,0)+1);
            }
        }
        // print the map in key-value pairs using entry set
        for(Map.Entry<Character,Integer> entry: map1.entrySet()){
            System.out.println(entry.getKey()+", "+entry.getValue());
        }

        String str4 = "UnionWest";

        Map<Character,Integer> map2 = new HashMap<>();

        for(char ch : str4.toCharArray()){
            if(ch != ' '){
                map2.put(ch,map2.getOrDefault(ch,0)+1);
            }
        }

        for(Map.Entry<Character,Integer> entry:map2.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
