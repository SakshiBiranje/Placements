import java.util.*;

public class BestTimeToSellAndBuyStockII {
    public static void main(String[] args) {
        int[] prices = {3,1,2,3,5,6,7,3};
    
        System.out.println("Profit :"+profit(prices));
    }
    public static int profit(int[] prices){
        int profit=0;
        
        for(int i=1;i< prices.length;i++){
            int diff = prices[i] - prices[i-1];
        if(diff >0){
            profit += diff;
        }
        }
        
        return profit;
    }
}
