package leetcode;

import java.util.Arrays;

/**
 * <b>1679. Max Number of K-Sum Pairs</b>
 * <p>
 * <a href="https://leetcode.com/problems/max-number-of-k-sum-pairs/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * You are given an integer array nums and an integer k.
 * In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
 * <p>
 * Return the maximum number of operations you can perform on the array.
 * <p>
 * <b>Constraints:</b><p>
 * 1 <= nums.length <= 10^5 <p>
 * 1 <= nums[i] <= 10^9 <p>
 * 1 <= k <= 10^9
 */
public class MaxNumberOfKSumPairs {
    public int maxOperations(int[] nums, int k) {
        int len = nums.length;
        int result = 0;
        int left = 0;
        int right = len - 1;

        Arrays.sort(nums);

        while (left < right) {
            if(nums[left] + nums[right] == k) {
                result++;
                left++;
                right--;
            }
            else if (nums[left] + nums[right] < k) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}
