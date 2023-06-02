package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>121. Best Time to Buy and Sell Stock</b>
 * <p>
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock">LeetCode Problem</a>
 * <p>
 *
 * @see leetcode.BestTimeToBuyAndSellStock
 */
public class BestTimeToBuyAndSellStockTest {

    private final BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();

    @Test
    public void maxProfit_Testcase1() {
        int[] prices = {7,1,5,3,6,4};
        int actualOutput = solution.maxProfit(prices);
        int expectedOutput = 5;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void maxProfit_Testcase2() {
        int[] prices = {7,6,4,3,1};
        int actualOutput = solution.maxProfit(prices);
        int expectedOutput = 0;

        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
