package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>80. Remove Duplicates from Sorted Array II</b>
 * <p>
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii">LeetCode Problem</a>
 * <p>
 *
 * @see leetcode.RemoveDuplicatesFromSortedArrayII
 */
public class RemoveDuplicatesFromSortedArrayIITest {

    private final RemoveDuplicatesFromSortedArrayII solution = new RemoveDuplicatesFromSortedArrayII();

    @Test
    public void removeDuplicates_Testcase1() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int actualOutput = solution.removeDuplicates(nums);
        int expectedOutput = 5;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void removeDuplicates_Testcase2() {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int actualOutput = solution.removeDuplicates(nums);
        int expectedOutput = 7;

        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
