package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MakeUniqueArray {
    public static void main(String[] args) {
        int [] arr =  {1,6,3,4,3,4,9,2,7,8,9,10,11,6,45,3,2,45,767,879,111,345};
        int [] arr_1 = uniqueArray(arr);
        System.out.println(Arrays.toString(arr_1));
    }

    private static int[] uniqueArray(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        int[] uniqueArray = set.stream().mapToInt(Integer::intValue).toArray();
        Integer[] uni2 = set.toArray(new Integer[0]);

        System.out.println(Arrays.toString(uni2));
        return uniqueArray;
    }
}
