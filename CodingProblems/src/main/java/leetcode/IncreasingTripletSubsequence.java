package leetcode;

/**
 * <b>334. Increasing Triplet Subsequence</b>
 * <p>
 * <a href="https://leetcode.com/problems/increasing-triplet-subsequence/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * Given an integer array nums, return true if there exists a triple of indices (i, j, k) such
 * that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
 * <p>
 * <b>Constraints:</b><p>
 * 1 <= nums.length <= 5 * 105 <p>
 * -231 <= nums[i] <= 231 - 1
 */
public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int n1 = Integer.MAX_VALUE;
        int n2 = Integer.MAX_VALUE;
        if(nums.length < 3) return false;
        for (int num : nums) {
            if(num <= n1) n1 = num;
            else if(num <= n2) n2 = num;
            else return true;
        }
        return false;
    }
}
