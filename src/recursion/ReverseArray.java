package recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {7,5,2,4,6};

        int [] arr2 = reverseArray(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr2));
    }
    static int[] reverseArray(int arr[],int left,int right){
        if (left >= right) {
            return arr;
        }

        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;

        return reverseArray(arr,left+1,right-1);
    }
}
