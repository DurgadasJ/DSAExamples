package hackerRank;

import java.util.Arrays;
import java.util.List;

public class Statement1 {
    public static void main(String[] args) {
        List<Integer> cells = Arrays.asList(30,10,20);
        int minPowerRequired = minPower(cells);
        System.out.println("Min power :" + minPowerRequired);

    }

    private static int minPower(List<Integer> cells) {
        int minP=0;
        int[] array = cells.stream().mapToInt(i -> i).toArray();
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        for(int i=0;i<array.length-1;i++){
            int cell1 = array[i];
            int cell2 = array[i+1];
            int power = cell1+cell2;

            minP +=power;

            array[i+1] = power;
            Arrays.sort(array,i+1,array.length);
        }
        System.out.println(Arrays.toString(array));
        return minP;
    }
}
