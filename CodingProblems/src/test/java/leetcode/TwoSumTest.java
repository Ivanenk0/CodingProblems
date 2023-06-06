package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>1. Two Sum</b>
 * <p>
 * <a href="https://leetcode.com/problems/two-sum/">LeetCode Problem</a>
 * <p>
 *
 * @see leetcode.TwoSum
 */
public class TwoSumTest {

    private final TwoSum solution = new TwoSum();

    @Test
    public void twoSum_Testcase1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] actualOutput = solution.twoSum(nums, target);
        int[] expectedOutput = {0, 1};

        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void twoSum_Testcase2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] actualOutput = solution.twoSum(nums, target);
        int[] expectedOutput = {1, 2};

        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void twoSum_Testcase3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] actualOutput = solution.twoSum(nums, target);
        int[] expectedOutput = {0, 1};

        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }
}
