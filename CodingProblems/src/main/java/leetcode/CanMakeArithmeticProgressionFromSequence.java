package leetcode;

import java.util.Arrays;

/**
 * <b>1502. Can Make Arithmetic Progression From Sequence</b>
 * <p>
 * <a href="https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/">LeetCode Problem</a>
 * <p>
 * A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
 * <p>
 * Given an array of numbers arr, return true if the
 * array can be rearranged to form an arithmetic progression. Otherwise, return false.
 * <p>
 * <b>Constraints:</b><p>
 * 2 <= arr.length <= 1000 <p>
 * -10^6 <= arr[i] <= 10^6
 */
public class CanMakeArithmeticProgressionFromSequence {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for(int i = 1; i<arr.length - 1; i++) {
            if(arr[i] - arr[i-1] != arr[i+1] - arr[i]) return false;
        }
        return true;
    }
}
