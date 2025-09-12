package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,11,7,15};
        int target = 9;
        int[] result = twoSum_1(nums, target);
        if (result.length == 0) {
            System.out.println("No two sum solution found.");
        } else {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }
    }

    private static int[] twoSum_1(int [] arr,int target){
        Map<Integer,Integer> map = new HashMap<>();
        // traverse / iterate the array
        for(int i=0;i<arr.length;i++){
            // find the complement
            int rem = target - arr[i];
            // check if rem exists in map
            if(map.containsKey(rem)){
                return new int[]{map.get(rem),i};
            }else{
                map.put(arr[i],i);
            }
        }

        return new int []{};
    }

    //to return list of pair having two sum
    private static List<List<Integer>> twoSumPairs(int [] arr, int target){
        Map<Integer,Integer> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        List<List<Integer>> result1  = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int rem = target - arr[i];
            if(map.containsKey(rem)){
                  result.add(java.util.Arrays.asList(map.get(rem),i));
                  result1.add(new ArrayList<>(List.of(map.get(rem),i)));
            }else{
                  map.put(arr[i],i);
            }
        }
        return result;
    }


//    private static int[] twoSum(int[] nums, int target) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<nums.length;i++){
//            int diff = target - nums[i];
//            if(map.containsKey(diff)){
//                return new int[]{map.get(diff),i};
//            }else{
//                map.put(nums[i],i);
//            }
//        }
//
//        return new int[]{};
//    }
}
