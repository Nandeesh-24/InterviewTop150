package Medium;

public class BestTimeToBuySellStock2 {
    /*
    You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

    On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.

    Find and return the maximum profit you can achieve.
     */

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{2,1,2,0,1}));
    }

    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - buy > 0) {
                profit += prices[i] - buy;
                buy=prices[i];
            }else {
                if (prices[i] < buy) {
                    buy = prices[i];
                }
            }
        }

        return profit;
    }
}
