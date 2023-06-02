package leetcode;

/**
 * <b>121. Best Time to Buy and Sell Stock</b>
 * <p>
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock">LeetCode Problem</a>
 * <p>
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different
 * day in the future to sell that stock.
 * <p>
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * <p>
 * <b>Constraints:</b><p>
 * 1 <= prices.length <= 10^5 <p>
 * 0 <= prices[i] <= 10^4
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int profit = 0;
        int pricesLength = prices.length;

        for(int i = 0; i < pricesLength; i++) {
            for(int j = i+1; j < pricesLength; j++) {
                int currentProfit = prices[j] - prices[i];
                if (currentProfit > profit) {
                    profit = currentProfit;
                }
            }
        }

        return profit;
    }
}
