package leetcode;

/**
 * <b>643. Maximum Average Subarray I</b>
 * <p>
 * <a href="https://leetcode.com/problems/maximum-average-subarray-i/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * You are given an integer array nums consisting of n elements, and an integer k.
 * <p>
 * Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
 * Any answer with a calculation error less than 10-5 will be accepted.
 * <p>
 * <b>Constraints:</b><p>
 * n == nums.length <p>
 * 1 <= k <= n <= 10^5 <p>
 * -10^4 <= nums[i] <= 10^4
 */
public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        double window = 0;
        for (int i = 0; i < k; i++) window += nums[i];
        double result = window;
        for (int i = k; i < nums.length; i++) {
            window += nums[i] - nums[i - k];
            result = Math.max(window, result);
        }
        return result/k;
    }
}
