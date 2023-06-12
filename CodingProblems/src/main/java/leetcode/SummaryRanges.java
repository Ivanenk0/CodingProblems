package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>228. Summary Ranges</b>
 * <p>
 * <a href="https://leetcode.com/problems/summary-ranges">LeetCode Problem</a>
 * <p>
 * You are given a sorted unique integer array nums.
 * A range [a,b] is the set of all integers from a to b (inclusive).
 * <p>
 * Return the smallest sorted list of ranges that cover all the numbers in the array exactly.
 * That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such
 * that x is in one of the ranges but not in nums.
 * <p>
 * <b>Constraints:</b><p>
 * 0 <= nums.length <= 20 <p>
 * -2^31 <= nums[i] <= 2^31 - 1 <p>
 * All the values of nums are unique. <p>
 * nums is sorted in ascending order.
 */
public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            final int start = nums[i];
            while (i + 1 < nums.length && nums[i] == nums[i + 1] - 1)
                i++;
            final int end = nums[i];
            if (start == end)
                result.add("" + start);
            else
                result.add("" + start + "->" + end);
        }

        return result;
    }
}
