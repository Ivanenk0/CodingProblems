package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>1920. Build Array from Permutation</b>
 * <p>
 * <a href="https://leetcode.com/problems/build-array-from-permutation/">LeetCode Problem</a>
 * <p>
 * @see leetcode.BuildArrayFromPermutation
 */
public class BuildArrayFromPermutationTest {

    private final BuildArrayFromPermutation solution = new BuildArrayFromPermutation();

    @Test
    public void buildArray_Testcase1() {
        int[] nums = {0,2,1,5,3,4};
        int[] actualOutput = solution.buildArray(nums);
        int[] expectedOutput = {0,1,2,4,5,3};

        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void buildArray_Testcase2() {
        int[] nums = {5,0,1,2,3,4};
        int[] actualOutput = solution.buildArray(nums);
        int[] expectedOutput = {4,5,0,1,2,3};

        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }
}
