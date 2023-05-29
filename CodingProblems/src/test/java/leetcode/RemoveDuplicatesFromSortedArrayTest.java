package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>26. Remove Duplicates from Sorted Array</b>
 * <p>
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/?envType=study-plan-v2&id=top-interview-150">LeetCode Problem</a>
 * <p>
 *
 * @see leetcode.RemoveDuplicatesFromSortedArray
 */
public class RemoveDuplicatesFromSortedArrayTest {

    private final RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();

    @Test
    public void removeDuplicates_Testcase1() {
        int[] nums = {1, 1, 2};
        int actualOutput = solution.removeDuplicates(nums);
        int expectedOutput = 2;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void removeDuplicates_Testcase2() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int actualOutput = solution.removeDuplicates(nums);
        int expectedOutput = 5;

        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
