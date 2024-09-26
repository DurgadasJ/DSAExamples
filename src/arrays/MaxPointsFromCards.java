package arrays;

public class MaxPointsFromCards {
    public static void main(String[] args) {
        int [] arr = {9,2,3,4,5,6,1};
        int k=3;
        int sum = maxScore(arr,k);
        System.out.println(sum);

    }

    private static int maxScore(int[] arr, int k) {
        int n= arr.length;
        int totalSum=0;
        for (int i = n - k; i < n; i++) {
            totalSum += arr[i];
        }

        int maxScore = totalSum;
        int currentSum = totalSum;
        for (int i = 0; i < k; i++) {

            currentSum -= arr[n - k + i];//7 1 0
            currentSum += arr[i];//8 3 3


            maxScore = Math.max(maxScore, currentSum);//12 12 3
        }
        return maxScore;
    }
}
