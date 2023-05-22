package leetcode;

import java.util.Arrays;

/**
 * <b>1732. Find the Highest Altitude</b>
 * <p>
 * <a href="https://leetcode.com/problems/find-the-highest-altitude/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
 * The biker starts his trip on point 0 with altitude equal 0.
 * <p>
 * You are given an integer array gain of length n where gain[i] is the net gain in altitude between
 * points i and i + 1 for all (0 <= i < n).
 * Return the highest altitude of a point.
 * <p>
 * <b>Constraints:</b><p>
 * n == gain.length <p>
 * 1 <= n <= 100 <p>
 * -100 <= gain[i] <= 100
 */
public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int[] result = new int[gain.length+1];
        result[0] = 0;
        for (int i = 1, j = 0; i < result.length; i++, j++) {
//            int previous = result[j];
//            int current = gain[j];
//            result[i] = previous + current;
            result[i] = result[j] + gain[j];
        }
        return Arrays.stream(result).max().getAsInt();
    }
}
