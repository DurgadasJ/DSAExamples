package arrays;

public class BestTimeToBuyNSell {
    public static void main(String[] args) {
        int [] arr = {7,1,3,4,15,6,9};
        int maxProfit = bestProfit(arr);
        System.out.println(maxProfit);
    }

    private static int bestProfit(int stocks[]){
        if(stocks==null|| stocks.length<2){
            return 0;
        }
        int maxProf=0;
        int minPrice = stocks[0];
        for(int i=0;i<stocks.length;i++){
            if(stocks[i]<minPrice){
                minPrice= stocks[i];
            }
            int currProf= stocks[i] - minPrice;
            if(currProf>maxProf){
                maxProf=currProf;
            }
        }
        return maxProf;
    }
}
