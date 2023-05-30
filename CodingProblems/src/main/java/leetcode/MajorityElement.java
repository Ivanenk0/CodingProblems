package leetcode;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * <b>169. Majority Element</b>
 * <p>
 * <a href="https://leetcode.com/problems/majority-element">LeetCode Problem</a>
 * <p>
 * Given an array nums of size n, return the majority element.
 * <p>
 * The majority element is the element that appears more than [n / 2] times.
 * You may assume that the majority element always exists in the array.
 * <p>
 * <b>Constraints:</b><p>
 * n == nums.length <p>
 * 1 <= n <= 5 * 10^4 <p>
 * -10^9 <= nums[i] <= 10^9
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int majorityOfArray = nums.length / 2;
        int majorityElement = 0;
        int k = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] == nums[i - 1]) {
                k++;
                if (k > majorityOfArray) majorityElement = nums[i];
            } else {
                k = 0;
                k++;
            }
        }
        return majorityElement;
    }

    public int majorityElement_Solution2(int[] nums) {
        int majorityOfArray = nums.length / 2;
        return (int) Arrays.stream(nums).collect(ArrayList::new, ArrayList::add, ArrayList::addAll)
                .stream().collect(Collectors.groupingBy(Function.identity())).entrySet()
                .stream().filter(element -> ((element.getValue()).size() > majorityOfArray)).findFirst().get().getKey();

    }
}
