package leetcode;

/**
 * <b>11. Container With Most Water</b>
 * <p>
 * <a href="https://leetcode.com/problems/container-with-most-water/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * You are given an integer array height of length n.
 * There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * <p>
 * Return the maximum amount of water a container can store.
 * <p>
 * <b>Constraints:</b><p>
 * n == height.length <p>
 * 2 <= n <= 10^5 <p>
 * 0 <= height[i] <= 10^4
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int right = height.length-1;
        int left = 0;
        int result = 0;

        while(left < right) {
            int minimalHeight = Math.min(height[left], height[right]);
            int area = minimalHeight * (right - left);
            result = Math.max(result,area);

            if (height[left] > height[right]) right--;
            else if (height[left] < height[right]) left++;
            else {
                left++;
                right--;
            }
        }

        return result;
    }
}
