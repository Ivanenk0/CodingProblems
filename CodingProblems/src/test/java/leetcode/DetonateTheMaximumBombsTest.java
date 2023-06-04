package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>2101. Detonate the Maximum Bombs</b>
 * <p>
 * <a href="https://leetcode.com/problems/detonate-the-maximum-bombs/">LeetCode Problem</a>
 * <p>
 *
 * @see leetcode.DetonateTheMaximumBombs
 */
public class DetonateTheMaximumBombsTest {

    private final DetonateTheMaximumBombs solution = new DetonateTheMaximumBombs();

    @Test
    public void maximumDetonation_Testcase1() {
        int[][] bombs = {{2, 1, 3}, {6, 1, 4}};
        int actualOutput = solution.maximumDetonation(bombs);
        int expectedOutput = 2;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void maximumDetonation_Testcase2() {
        int[][] bombs = {{1, 1, 5}, {10, 10, 5}};
        int actualOutput = solution.maximumDetonation(bombs);
        int expectedOutput = 1;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void maximumDetonation_Testcase3() {
        int[][] bombs = {{1, 2, 3}, {2, 3, 1}, {2, 3, 1}, {4, 5, 3}, {5, 6, 4}};
        int actualOutput = solution.maximumDetonation(bombs);
        int expectedOutput = 5;

        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
