package leetcode;

import java.util.*;

/**
 * <b>2215. Find the Difference of Two Arrays</b>
 * <p>
 * <a href="https://leetcode.com/problems/find-the-difference-of-two-arrays/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
 * <p>
 * answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
 * <p>
 * answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
 * <p>
 * Note that the integers in the lists may be returned in any order.
 * <p>
 * <b>Constraints:</b><p>
 * 1 <= nums1.length, nums2.length <= 1000 <p>
 * -1000 <= nums1[i], nums2[i] <= 1000
 */
public class FindTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> setNums1 = new HashSet<>();
        Set<Integer> setNums2 = new HashSet<>();

        for(int i : nums1) setNums1.add(i);
        for(int i : nums2) setNums2.add(i);

        List<Integer> answer1 = new ArrayList<>();
        List<Integer> answer2 = new ArrayList<>();

        for (int i : setNums1) if (!setNums2.contains(i)) answer1.add(i);
        for (int i : setNums2) if (!setNums1.contains(i)) answer2.add(i);

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(answer1));
        result.add(new ArrayList<>(answer2));
        return result;
    }
}
