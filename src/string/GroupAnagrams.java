package string;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String [] str = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> arr = groupAnagrams(str);

        System.out.println(arr.toString());
    }

    private static List<List<String>>  groupAnagrams(String[] str) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : str){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
