package leetcode;

import java.util.Arrays;

/**
 * <b>724. Find Pivot Index</b>
 * <p>
 * <a href="https://leetcode.com/problems/find-pivot-index/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * Given an array of integers nums, calculate the pivot index of this array.
 * <p>
 * The pivot index is the index where the sum of all the numbers
 * strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
 * <p>
 * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left.
 * This also applies to the right edge of the array.
 * <p>
 * Return the leftmost pivot index. If no such index exists, return -1.
 * <b>Constraints:</b><p>
 * 1 <= nums.length <= 104 <p>
 * -1000 <= nums[i] <= 1000
 */
public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int totalSum = Arrays.stream(nums).sum();
        int leftSum = 0;
        for(int pivotIndex = 0; pivotIndex < nums.length; leftSum += nums[pivotIndex], pivotIndex++) {
            if (leftSum == totalSum - leftSum - nums[pivotIndex]) {
                return pivotIndex;
            }
        }
        return -1;
    }
}
