package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>1232. Check If It Is a Straight Line</b>
 * <p>
 * <a href="https://leetcode.com/problems/check-if-it-is-a-straight-line">LeetCode Problem</a>
 * <p>
 *
 * @see leetcode.CheckIfItIsAStraightLine
 */
public class CheckIfItIsAStraightLineTest {

    private final CheckIfItIsAStraightLine solution = new CheckIfItIsAStraightLine();

    @Test
    public void checkStraightLine_Testcase1() {
        int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        boolean actualSolution = solution.checkStraightLine(coordinates);
        boolean expectedOutput = true;

        Assert.assertEquals(expectedOutput, actualSolution);
    }

    @Test
    public void checkStraightLine_Testcase2() {
        int[][] coordinates = {{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};
        boolean actualSolution = solution.checkStraightLine(coordinates);
        boolean expectedOutput = false;

        Assert.assertEquals(expectedOutput, actualSolution);
    }
}
