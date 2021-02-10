package lc._0121_bestTimeToBuyAndSellStock;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int max = 0;
        int soFarMin = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] >= soFarMin) {
                max = Math.max(prices[i] - soFarMin, max);
            } else {
                soFarMin = prices[i];
            }
        }
        return max;
    }
}
