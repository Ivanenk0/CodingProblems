package leetcode;

/**
 * <b>80. Remove Duplicates from Sorted Array II</b>
 * <p>
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii">LeetCode Problem</a>
 * <p>
 * Given an integer array nums sorted in non-decreasing order, remove some duplicates
 * in-place such that each unique element appears at most twice.
 * The relative order of the elements should be kept the same.
 * <p>
 * If there are k elements after removing the duplicates,
 * then the first k elements of nums should hold the final result.
 * It does not matter what you leave beyond the first k elements.
 * <p>
 * Return k after placing the final result in the first k slots of nums.
 * <p>
 * Do not allocate extra space for another array.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * <b>Constraints:</b><p>
 * 1 <= nums.length <= 3 * 10^4 <p>
 * -10^4 <= nums[i] <= 10^4 <p>
 * nums is sorted in non-decreasing order.
 */
public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1, duplicateCount = 0; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                duplicateCount++;
            } else {
                duplicateCount = 0;
            }
            if (duplicateCount < 2) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
