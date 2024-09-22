package arrays;

import java.util.HashSet;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int [] arr =  {1,6,3,4,9,2,7,8,9,10,11};
        int n = 11;

        //int m = firstMissing(arr,n);
        System.out.println(firstMissing(arr,n));
    }
    static int  firstMissing(int [] arr,int n){
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                return i;
            }
        }

        return n+1;
    }
}
