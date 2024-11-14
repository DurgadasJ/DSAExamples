package hackerRank;

import java.util.Arrays;
import java.util.List;

public class Statement2 {
    public static void main(String[] args) {
        List<Integer> boxes = Arrays.asList(1,2,3);
        List<Integer> unitPerBoxes = Arrays.asList(3,2,1);
        int truckSize = 3;

        int maxUnits = calmaxCap(boxes,unitPerBoxes,truckSize);
        System.out.println("Max Capacity :" +maxUnits);
    }

    private static int calmaxCap(List<Integer> boxes, List<Integer> unitPerBoxes, int truckSize) {
        int maxCap=0;
        for(int i=0;i<boxes.size();i++){
            if(truckSize>=boxes.get(i)){
                maxCap = maxCap + boxes.get(i)*unitPerBoxes.get(i);
                truckSize -= boxes.get(i);
            }else{
                maxCap = maxCap+truckSize*unitPerBoxes.get(i);
                break;
            }
        }
        return maxCap;
    }
}
