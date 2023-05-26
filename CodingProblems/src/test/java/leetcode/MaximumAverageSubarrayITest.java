package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>643. Maximum Average Subarray I</b>
 * <p>
 * <a href="https://leetcode.com/problems/maximum-average-subarray-i/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 *
 * @see leetcode.MaximumAverageSubarrayI
 */
public class MaximumAverageSubarrayITest {

    private final MaximumAverageSubarrayI solution = new MaximumAverageSubarrayI();

    @Test
    public void findMaxAverage_Testcase1() {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double actualOutput = solution.findMaxAverage(nums, k);
        double expectedOutput = 12.75000;

        Assert.assertEquals(expectedOutput, actualOutput, 0.000);
    }

    @Test
    public void findMaxAverage_Testcase2() {
        int[] nums = {0,1,1,3,3};
        int k = 4;
        double actualOutput = solution.findMaxAverage(nums, k);
        double expectedOutput = 2.00000;

        Assert.assertEquals(expectedOutput, actualOutput, 0.000);
    }

    @Test
    public void findMaxAverage_Testcase3() {
        int[] nums = {5};
        int k = 1;
        double actualOutput = solution.findMaxAverage(nums, k);
        double expectedOutput = 5.00000;

        Assert.assertEquals(expectedOutput, actualOutput, 0.000);
    }
}
