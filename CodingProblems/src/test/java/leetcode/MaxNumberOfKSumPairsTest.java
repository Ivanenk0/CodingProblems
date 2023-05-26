package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>1679. Max Number of K-Sum Pairs</b>
 * <p>
 * <a href="https://leetcode.com/problems/max-number-of-k-sum-pairs/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * @see leetcode.MaxNumberOfKSumPairs
 */
public class MaxNumberOfKSumPairsTest {

    private final MaxNumberOfKSumPairs solution = new MaxNumberOfKSumPairs();

    @Test
    public void maxOperations_Testcase1() {
        int[] nums = {1,2,3,4};
        int k = 5;
        int actualOutput = solution.maxOperations(nums, k);
        int expectedOutput = 2;

        Assert.assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void maxOperations_Testcase2() {
        int[] nums = {3,1,3,4,3};
        int k = 6;
        int actualOutput = solution.maxOperations(nums, k);
        int expectedOutput = 1;

        Assert.assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void maxOperations_Testcase3() {
        int[] nums = {5,6,7,8};
        int k = 12;
        int actualOutput = solution.maxOperations(nums, k);
        int expectedOutput = 1;

        Assert.assertEquals(expectedOutput,actualOutput);
    }
}
