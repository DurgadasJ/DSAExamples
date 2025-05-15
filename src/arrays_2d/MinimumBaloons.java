package arrays_2d;

import java.util.Arrays;

public class MinimumBaloons {
    public static void main(String[] args) {
        int[][] points = {{5, 6}, {3, 4}, {1, 2}};
        int count = minBaloons(points);
        System.out.println(count);
    }

    private static int minBaloons(int[][] points) {
        int count=0;

        Arrays.sort(points,(a,b) -> Integer.compare(a[0],b[0]));
        for (int[] point : points) {
            System.out.println(Arrays.toString(point));
        }
        int end = points[0][1];
        //System.out.println(end);
        for(int i=0;i<points.length;i++){
            if(points[i][0]<=end){
                end = Math.min(end,points[i][1]);
            }else{
                end = points[i][1];
                count++;
            }
        }
        return count;
    }


}
