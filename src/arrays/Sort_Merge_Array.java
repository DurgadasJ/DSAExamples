package arrays;

import java.util.Arrays;

public class Sort_Merge_Array {
    public static void main(String[] args) {
        int [] arr1 = {1,3,4,6};
        int [] arr2 = {2,4,7,8};

        int merged[] = mergeArr(arr1,arr2);
        

        System.out.println(Arrays.toString(merged));
    }

    public static int[] mergeArr(int arr1[],int arr2[]){

        int n1 = arr1.length;
        int n3 = arr2.length;

        int merged[] = new int[n1+n3];

        int i=0,j=0,k=0;

        while(i<n1 && j<n3){
            if(arr1[i]<arr2[j]){
                merged[k++]=arr1[i++];
            }else{
                merged[k++]=arr2[j++];
            }
        }

        while(i<n1){
          merged[k++]=arr1[i++];
        }

        while (j<n3){
         merged[k++]=arr2[j++];
        }


        return merged;
    }
}
