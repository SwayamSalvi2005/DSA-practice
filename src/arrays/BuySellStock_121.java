package arrays;

public class BuySellStock_121 {

    public int maxProfit(int[] prices) {

        int n = prices.length;

        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;


        for(int i =0; i<n; i++){
            if(prices[i] < buyPrice){
                buyPrice = prices[i];
            }

            int profit = prices[i] - buyPrice;

            if(profit > maxProfit){
                maxProfit = profit;
            }
        }


        return maxProfit;

    }
}
