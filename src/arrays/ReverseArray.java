package arrays;

import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,4,6};
        revArray(arr.clone());
        revArray_2(arr.clone());
        revArray_List(arr);

    }
    public static void revArray(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            int tmp = arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[i];
            arr[i] = tmp;
        }
        System.out.println("rev 1: " +Arrays.toString(arr));
    }

    public static void revArray_2(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            int tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;
            l++;
            r--;
        }
        System.out.println("rev 2: " + Arrays.toString(arr));
    }

    private static void revArray_List(int[] clone) {
        List<Integer> lst =  new ArrayList<>(Arrays.asList(1,2,3,5,4,6));
        Collections.reverse(lst);
        System.out.println("rev 4" +lst.stream().sorted(Comparator.reverseOrder()).toList());

        Object[] arr = lst.stream().sorted(Comparator.reverseOrder()).toArray();
        System.out.println("Array Started");
        for(int i=0;i<lst.size();i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.println("rev 3: "+lst);
    }
}
