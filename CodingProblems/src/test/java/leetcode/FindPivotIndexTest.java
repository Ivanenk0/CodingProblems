package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>724. Find Pivot Index</b>
 * <p>
 * <a href="https://leetcode.com/problems/find-pivot-index/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * @see leetcode.FindPivotIndex
 */
public class FindPivotIndexTest {

    private final FindPivotIndex solution = new FindPivotIndex();

    @Test
    public void pivotIndex_Testcase1() {
        int[] nums = {1,7,3,6,5,6};
        int actualOutput = solution.pivotIndex(nums);
        int expectedOutput = 3;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pivotIndex_Testcase2() {
        int[] nums = {1,2,3};
        int actualOutput = solution.pivotIndex(nums);
        int expectedOutput = -1;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pivotIndex_Testcase3() {
        int[] nums = {2,1,-1};
        int actualOutput = solution.pivotIndex(nums);
        int expectedOutput = 0;

        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
