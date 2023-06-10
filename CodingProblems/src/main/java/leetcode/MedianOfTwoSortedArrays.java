package leetcode;

import java.util.stream.IntStream;

/**
 * <b>4. Median of Two Sorted Arrays</b>
 * <p>
 * <a href="https://leetcode.com/problems/median-of-two-sorted-arrays">LeetCode Problem</a>
 * <p>
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * <p>
 * The overall run time complexity should be O(log (m+n)).
 * <p>
 * <b>Constraints:</b><p>
 * nums1.length == m <p>
 * nums2.length == n <p>
 * 0 <= m <= 1000 <p>
 * 0 <= n <= 1000 <p>
 * 1 <= m + n <= 2000 <p>
 * -10^6 <= nums1[i], nums2[i] <= 10^6
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Merge both input arrays into one & sort it.
        int[] mergedArr = IntStream.concat(IntStream.of(nums1), IntStream.of(nums2))
                .sorted()
                .toArray();

        int mergedLength = mergedArr.length;

        if (mergedLength % 2 != 0) return mergedArr[mergedLength / 2];
        return (double) (mergedArr[mergedLength / 2 - 1] + mergedArr[mergedLength / 2]) / 2;
    }
}
