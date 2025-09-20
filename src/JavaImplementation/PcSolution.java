package JavaImplementation;

import java.util.HashMap;
import java.util.Map;

public class PcSolution {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();

        map.put(1,23);
        map.put(2,34);
        map.put(3,45);

        String str = "name";

        // how to get minimum value from map and retrieve its key
        Integer minKey = map.entrySet().stream()
                .min(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println(
                "Key with minimum value: " + minKey
        );
    }
}
