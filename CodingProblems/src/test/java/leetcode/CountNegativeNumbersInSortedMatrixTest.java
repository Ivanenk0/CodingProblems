package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>1351. Count Negative Numbers in a Sorted Matrix</b>
 * <p>
 * <a href="https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/">LeetCode Problem</a>
 * <p>
 *
 * @see CountNegativeNumbersInSortedMatrix
 */
public class CountNegativeNumbersInSortedMatrixTest {

    private final CountNegativeNumbersInSortedMatrix solution = new CountNegativeNumbersInSortedMatrix();

    @Test
    public void countNegatives_Testcase1() {
        int[][] grid = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        int actualOutput = solution.countNegatives(grid);
        int expectedOutput = 8;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void countNegatives_Testcase2() {
        int[][] grid = {{3, 2}, {1, 0}};
        int actualOutput = solution.countNegatives(grid);
        int expectedOutput = 0;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void countNegatives_Testcase3() {
        int[][] grid = {{5, 1, 0}, {-5, -5, -5}};
        int actualOutput = solution.countNegatives(grid);
        int expectedOutput = 3;

        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
