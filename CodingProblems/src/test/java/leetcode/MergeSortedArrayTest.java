package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>88. Merge Sorted Array</b>
 * <p>
 * <a href="https://leetcode.com/problems/merge-sorted-array">LeetCode Problem</a>
 * <p>
 *
 * @see leetcode.MergeSortedArray
 */
public class MergeSortedArrayTest {

    private final MergeSortedArray solution = new MergeSortedArray();

    @Test
    public void merge_Testcase1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        int[] actualOutput = solution.merge(nums1, m, nums2, n);
        int[] expectedOutput = {1, 2, 2, 3, 5, 6};

        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void merge_Testcase2() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        int[] actualOutput = solution.merge(nums1, m, nums2, n);
        int[] expectedOutput = {1};

        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void merge_Testcase3() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        int[] actualOutput = solution.merge(nums1, m, nums2, n);
        int[] expectedOutput = {1};

        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }
}
