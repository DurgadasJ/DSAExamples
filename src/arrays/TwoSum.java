package arrays;

import java.util.HashMap;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,11,7,15};
        int target = 9;
        int[] result = twoSum(nums, target);
        if (result.length == 0) {
            System.out.println("No two sum solution found.");
        } else {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }
    }

    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }else{
                map.put(nums[i],i);
            }
        }

        return new int[]{};
    }
}
