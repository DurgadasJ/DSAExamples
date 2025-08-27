package string;

import java.util.HashMap;

public class CharacterCount {
    public static void main(String[] args) {
        String str1 = "Welcome to Intellij Ideaa";
        String str = str1.toLowerCase();

        HashMap<Character,Integer> map = new HashMap<>();

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
        System.out.println(map.toString());
        System.out.println(map);

        Map<Character,Integer> map1 = new HashMap<>();

        for(char ch : str.toCharArray()){
            if(ch!=''){
                map1.put(ch,map1.getOrDefault(ch,0)+1);
            }
        }

        for(Entry<Character,Integer> entry: map1.entrySet()){
            System.out.println(entry.getKey()+", "+entry.getValue());
        }
    }
}
