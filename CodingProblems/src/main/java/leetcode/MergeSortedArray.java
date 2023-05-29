package leetcode;


import java.util.Arrays;

/**
 * <b>88. Merge Sorted Array</b>
 * <p>
 * <a href="https://leetcode.com/problems/merge-sorted-array">LeetCode Problem</a>
 * <p>
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 * and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * <p>
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * <p>
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
 * To accommodate this, nums1 has a length of m + n, where the first m elements
 * denote the elements that should be merged, and the last n elements are set to 0 and should be ignored.
 * nums2 has a length of n.
 * <p>
 * <b>Constraints:</b><p>
 * nums1.length == m + n <p>
 * nums2.length == n <p>
 * 0 <= m, n <= 200 <p>
 * 1 <= m + n <= 200 <p>
 * -10^9 <= nums1[i], nums2[j] <= 10^9
 */
public class MergeSortedArray {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m, j = 0; i < m + n; i++, j++) nums1[i] = nums2[j];
        Arrays.sort(nums1);
        return nums1;
    }
}
