package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>189. Rotate Array</b>
 * <p>
 * <a href="https://leetcode.com/problems/rotate-array">LeetCode Problem</a>
 * <p>
 *
 * @see leetcode.RotateArray
 */
public class RotateArrayTest {

    private final RotateArray solution = new RotateArray();

    @Test
    public void rotate_Testcase1() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] actualOutput = solution.rotate(nums, k);
        int[] expectedOutput = {5, 6, 7, 1, 2, 3, 4};

        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void rotate_Testcase2() {
        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        int[] actualOutput = solution.rotate(nums, k);
        int[] expectedOutput = {3, 99, -1, -100};

        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }


}
