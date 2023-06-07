package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>55. Jump Game</b>
 * <p>
 * <a href="https://leetcode.com/problems/jump-game">LeetCode Problem</a>
 * <p>
 *
 * @see leetcode.JumpGame
 */
public class JumpGameTest {

    private final JumpGame solution = new JumpGame();

    @Test
    public void canJump_Testcase1() {
        int[] nums = {2, 3, 1, 1, 4};
        boolean actualOutput = solution.canJump(nums);
        boolean expectedOutput = true;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void canJump_Testcase2() {
        int[] nums = {3, 2, 1, 0, 4};
        boolean actualOutput = solution.canJump(nums);
        boolean expectedOutput = false;

        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
