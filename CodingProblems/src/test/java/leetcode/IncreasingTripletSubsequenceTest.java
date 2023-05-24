package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>334. Increasing Triplet Subsequence</b>
 * <p>
 * <a href="https://leetcode.com/problems/increasing-triplet-subsequence/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * @see leetcode.IncreasingTripletSubsequence
 */
public class IncreasingTripletSubsequenceTest {

    private final IncreasingTripletSubsequence solution = new IncreasingTripletSubsequence();

    @Test
    public void increasingTriplet_Testcase1() {
        int[] nums = {1,2,3,4,5};
        boolean actualOutput = solution.increasingTriplet(nums);
        boolean expectedOutput = true;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void increasingTriplet_Testcase2() {
        int[] nums = {5,4,3,2,1};
        boolean actualOutput = solution.increasingTriplet(nums);
        boolean expectedOutput = false;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void increasingTriplet_Testcase3() {
        int[] nums = {2,1,5,0,4,6};
        boolean actualOutput = solution.increasingTriplet(nums);
        boolean expectedOutput = true;

        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
