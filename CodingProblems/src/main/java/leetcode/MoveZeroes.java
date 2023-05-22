package leetcode;

/**
 * <b>283. Move Zeroes</b>
 * <p>
 * <a href="https://leetcode.com/problems/move-zeroes/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * Given an integer array nums,
 * move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * Note that you must do this in-place without making a copy of the array.
 * <p>
 * <b>Constraints:</b><p>
 * 1 <= nums.length <= 104 <p>
 * -231 <= nums[i] <= 231 - 1
 */
public class MoveZeroes {
    public int[] moveZeroes(int[] nums) {
        int count= 0;
        for (int i =0; i<nums.length; i++) {
            if (nums[i] != 0) {
                nums[count] = nums[i];
                count++;
            }
        }
        while(count < nums.length) {
            nums[count] = 0;
            count++;
        }
        return nums;
    }
}
