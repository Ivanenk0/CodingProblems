package leetcode;

/**
 * <b>122. Best Time to Buy and Sell Stock II</b>
 * <p>
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii">LeetCode Problem</a>
 * <p>
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 * On each day, you may decide to buy and/or sell the stock.
 * You can only hold at most one share of the stock at any time.
 * However, you can buy it then immediately sell it on the same day.
 * <p>
 * Find and return the maximum profit you can achieve.
 * <p>
 * <b>Constraints:</b><p>
 * 1 <= prices.length <= 3 * 10^4 <p>
 * 0 <= prices[i] <= 10^4
 */
public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int currentProfit = prices[i] - prices[i-1];
            if (currentProfit > 0) profit += currentProfit;
        }
        return profit;
    }
}
