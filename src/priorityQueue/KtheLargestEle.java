package priorityQueue;

import java.util.PriorityQueue;

// Kth largest element in an array
public class KtheLargestEle {
    public static void main(String[] args) {
        int []nums = {3,2,1,5,6,4};
        int k = 4;

        int largestKth = findKthLargest(nums,k);
        System.out.println(largestKth);
    }

    private static int findKthLargest(int[] nums, int k) {
        // minHeap to store the k largest elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // add elements to the minHeap
        for(int num:nums){
            minHeap.offer(num);
            // keep the size of the minHeap to k
            if(minHeap.size()>k){
                // remove the smallest element
                minHeap.poll();
            }
        }
        System.out.println(minHeap.toString());

        return minHeap.peek();
    }
}
