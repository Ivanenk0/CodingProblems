package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>122. Best Time to Buy and Sell Stock II</b>
 * <p>
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii">LeetCode Problem</a>
 * <p>
 *
 * @see leetcode.BestTimeToBuyAndSellStockII
 */
public class BestTimeToBuyAndSellStockIITest {

    private final BestTimeToBuyAndSellStockII solution = new BestTimeToBuyAndSellStockII();

    @Test
    public void maxProfit_Testcase1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int actualOutput = solution.maxProfit(prices);
        int expectedOutput = 7;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void maxProfit_Testcase2() {
        int[] prices = {1, 2, 3, 4, 5};
        int actualOutput = solution.maxProfit(prices);
        int expectedOutput = 4;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void maxProfit_Testcase3() {
        int[] prices = {7, 6, 4, 3, 1};
        int actualOutput = solution.maxProfit(prices);
        int expectedOutput = 0;

        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
