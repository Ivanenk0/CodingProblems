package leetcode;

/**
 * <b>55. Jump Game</b>
 * <p>
 * <a href="https://leetcode.com/problems/jump-game">LeetCode Problem</a>
 * <p>
 * You are given an integer array nums. You are initially positioned at the array's first index,
 * and each element in the array represents your maximum jump length at that position.
 * <p>
 * Return true if you can reach the last index, or false otherwise.
 * <p>
 * <b>Constraints:</b><p>
 * 1 <= nums.length <= 10^4 <p>
 * 0 <= nums[i] <= 10^5
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        for (int curr = nums.length - 2; curr >= 0; curr--) {
            if (nums[curr] == 0) {
                int neededJumps = 1;
                while (neededJumps > nums[curr]) {
                    neededJumps++;
                    curr--;
                    if (curr < 0) return false;
                }
            }
        }
        return true;
    }
}
