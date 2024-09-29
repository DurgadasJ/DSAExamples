package priorityQueue;

import java.util.PriorityQueue;

public class KtheLargestEle {
    public static void main(String[] args) {
        int []nums = {3,2,1,5,6,4};
        int k = 4;

        int largestKth = findKthLargest(nums,k);
        System.out.println(largestKth);
    }

    private static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int num:nums){
            minHeap.offer(num);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }
}
