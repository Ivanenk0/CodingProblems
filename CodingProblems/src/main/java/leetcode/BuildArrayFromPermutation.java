package leetcode;

/**
 * <b>1920. Build Array from Permutation</b>
 * <p>
 * <a href="https://leetcode.com/problems/build-array-from-permutation/">LeetCode Problem</a>
 * <p>
 * Given a zero-based permutation nums (0-indexed),
 * build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
 * <p>
 * A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
 * <p>
 * <b>Constraints:</b><p>
 * 1 <= nums.length <= 1000 <p>
 * 0 <= nums[i] < nums.length <p>
 * The elements in nums are distinct.
 */
public class BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
