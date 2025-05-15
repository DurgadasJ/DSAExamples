package arrays;

public class BestTimeToBuyNSell {
    public static void main(String[] args){
        int [] arr = {7,1,5,3,6,4,9};

        int maxProfit = bestProfit(arr);
        System.out.println(maxProfit);
    }

    private static int bestProfit(int [] arr){
        if(arr==null || arr.length<2){
            return 0;
        }
        int minPrice=arr[0];
        int maxProfit=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minPrice){
                minPrice=arr[i];
            }
            int currentProfit = arr[i]-minPrice;
            if(currentProfit>maxProfit){
                    maxProfit = currentProfit;
                }
            }

        return maxProfit;
    }
}
