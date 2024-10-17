package permutation;

import java.util.ArrayList;
import java.util.List;

public class permutation {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        List<List<Integer>> result = new ArrayList<>();
        List<List<Integer>>  lst = backtrack(result, new ArrayList<>(), nums);

        System.out.println(lst.toString());

    }
    private static List<List<Integer>> backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (tempList.contains(nums[i])) continue;
                tempList.add(nums[i]);
                backtrack(result, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
        return result;
    }
}
