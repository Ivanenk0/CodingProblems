package leetcode;

/**
 * <b>1929. Concatenation of Array</b>
 * <p>
 * <a href="https://leetcode.com/problems/concatenation-of-array/">LeetCode Problem</a>
 * <p>
 * Given an integer array nums of length n, you want to create an array
 * ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 * <p>
 * Specifically, ans is the concatenation of two nums arrays.
 * <p>
 * Return the array ans.
 * <p>
 * <b>Constraints:</b><p>
 * n == nums.length <p>
 * 1 <= n <= 1000 <p>
 * 1 <= nums[i] <= 1000
 */
public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }
}
