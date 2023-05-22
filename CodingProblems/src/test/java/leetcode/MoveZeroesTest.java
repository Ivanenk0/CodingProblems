package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>283. Move Zeroes</b>
 * <p>
 * <a href="https://leetcode.com/problems/move-zeroes/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * @see leetcode.MoveZeroes
 */
public class MoveZeroesTest {

    private final MoveZeroes solution = new MoveZeroes();

    @Test
    public void moveZeroes_Testcase1() {
        int[] nums = {0,1,0,3,12};
        int[] actualOutput = solution.moveZeroes(nums);
        int[] expectedOutput = {1,3,12,0,0};

        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void moveZeroes_Testcase2() {
        int[] nums = {0};
        int[] actualOutput = solution.moveZeroes(nums);
        int[] expectedOutput = {0};

        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void moveZeroes_Testcase3() {
        int[] nums = {0,1,0,3,0};
        int[] actualOutput = solution.moveZeroes(nums);
        int[] expectedOutput = {1,3,0,0,0};

        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }
}
