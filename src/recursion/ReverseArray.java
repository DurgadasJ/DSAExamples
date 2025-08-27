package recursion;

import java.util.Arrays;

// Reverse an array using recursion
public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {7,5,2,4,6};
        // reverse array using recursion
        int [] arr2 = reverseArray(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr2));
    }
    static int[] reverseArray(int arr[],int left,int right){
        // base case
        if (left >= right) {
            return arr;
        }

        // swap
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
        // recursive call
        return reverseArray(arr,left+1,right-1);
    }
}
