import java.util.*;

public class BestTimeToSellAndBuyStock {
    public static void main(String[] args) {
        int[] prices = {3,1,2,3,5,6,7,3};
        System.out.println("Profit :"+profit(prices));
    }
    public static int profit(int[] prices){
        int profit=0;
        int minElement = Integer.MAX_VALUE;
        for(int i=0;i< prices.length;i++){
            profit = Math.max(profit, prices[i]-minElement);
            minElement = Math.min(prices[i], minElement);
        }
        
        return profit;
    }
}
