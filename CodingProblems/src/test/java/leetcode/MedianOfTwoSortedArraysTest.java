package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>4. Median of Two Sorted Arrays</b>
 * <p>
 * <a href="https://leetcode.com/problems/median-of-two-sorted-arrays">LeetCode Problem</a>
 * <p>
 *
 * @see leetcode.MedianOfTwoSortedArrays
 */
public class MedianOfTwoSortedArraysTest {

    private final MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();

    @Test
    public void findMedianSortedArrays_Testcase1() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double actualOutput = solution.findMedianSortedArrays(nums1, nums2);
        double expectedOutput = 2.00000;

        Assert.assertEquals(expectedOutput, actualOutput, 0.00000);
    }

    @Test
    public void findMedianSortedArrays_Testcase2() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double actualOutput = solution.findMedianSortedArrays(nums1, nums2);
        double expectedOutput = 2.50000;

        Assert.assertEquals(expectedOutput, actualOutput, 0.00000);
    }
}
