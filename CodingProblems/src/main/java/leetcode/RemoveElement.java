package leetcode;

/**
 * <b>27. Remove Element</b>
 * <p>
 * <a href="https://leetcode.com/problems/remove-element/?envType=study-plan-v2&id=top-interview-150">LeetCode Problem</a>
 * <p>
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 * The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
 * <p>
 * Note that you must do this in-place without making a copy of the array.
 * <p>
 * <b>Constraints:</b><p>
 * 0 <= nums.length <= 100 <p>
 * 0 <= nums[i] <= 50 <p>
 * 0 <= val <= 100
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) continue;
            nums[k] = nums[i];
            k++;
        }
        return k;
    }
}
