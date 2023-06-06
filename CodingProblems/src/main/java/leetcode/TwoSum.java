package leetcode;

/**
 * <b>1. Two Sum</b>
 * <p>
 * <a href="https://leetcode.com/problems/two-sum/">LeetCode Problem</a>
 * <p>
 * Given an array of characters chars, compress it using the following algorithm:
 * <p>
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 * <b>Constraints:</b><p>
 * 2 <= nums.length <= 10^4 <p>
 * -10^9 <= nums[i] <= 10^9 <p>
 * -10^9 <= target <= 10^9 <p>
 * Only one valid answer exists.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            result[0] = i;
            for (int j = i+1; j < nums.length; j++) {
                result[1] = j;
                if (nums[j] == target - nums[i]) return result;
            }
        }

        return result;
    }
}
