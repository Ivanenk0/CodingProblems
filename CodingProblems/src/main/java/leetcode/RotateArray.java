package leetcode;

/**
 * <b>189. Rotate Array</b>
 * <p>
 * <a href="https://leetcode.com/problems/rotate-array">LeetCode Problem</a>
 * <p>
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 * <p>
 * <b>Constraints:</b><p>
 * 1 <= nums.length <= 10^5 <p>
 * -2^31 <= nums[i] <= 2^31 - 1 <p>
 * 0 <= k <= 10^5
 */
public class RotateArray {
    public int[] rotate(int[] nums, int k) {
        int numsLength = nums.length;
        while(k > 0) {
            int buffer = nums[numsLength-1];
            for (int i = numsLength-1; i > 0; i--) {
                nums[i] = nums[i-1];
            }
            nums[0] = buffer;
            k--;
        }
        return nums;
    }

    /*
    public void rotate(int[] nums, int k) {
        int numsLength = nums.length;
        if(k >= numsLength) k = k % numsLength;
        int [] ans = new int[numsLength];
        for(int i = 0;  i < k;i++){
            ans[i] = nums[numsLength-k+i];
        }
        for (int j = 0 ; j < numsLength-k;j ++){
            ans[j+k] = nums[j];
            }
        for(int i = 0; i < numsLength ; i++){
            nums[i] = ans[i];
        }
    }
     */
}
