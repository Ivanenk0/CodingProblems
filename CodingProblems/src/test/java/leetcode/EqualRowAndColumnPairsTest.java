package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>2352. Equal Row and Column Pairs</b>
 * <p>
 * <a href="https://leetcode.com/problems/equal-row-and-column-pairs">LeetCode Problem</a>
 * <p>
 *
 * @see leetcode.EqualRowAndColumnPairs
 */
public class EqualRowAndColumnPairsTest {

    private final EqualRowAndColumnPairs solution = new EqualRowAndColumnPairs();

    @Test
    public void equalPairs_Testcase1() {
        int[][] grid = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        int actualOutput = solution.equalPairs(grid);
        int expectedOutput = 1;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void equalPairs_Testcase2() {
        int[][] grid = {{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}};
        int actualOutput = solution.equalPairs(grid);
        int expectedOutput = 3;

        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
