package leetcode;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * <b>26. Remove Duplicates from Sorted Array</b>
 * <p>
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/?envType=study-plan-v2&id=top-interview-150">LeetCode Problem</a>
 * <p>
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such
 * that each unique element appears only once.
 * The relative order of the elements should be kept the same.
 * Then return the number of unique elements in nums.
 * <p>
 * <b>Constraints:</b><p>
 * 1 <= nums.length <= 3 * 10^4 <p>
 * -100 <= nums[i] <= 100 <p>
 * nums is sorted in non-decreasing order.
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int k = Arrays.stream(nums).boxed().collect(Collectors.toSet()).size();
        for (int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if ( nums[i] == nums[j] && i != j) nums[j] = Integer.MAX_VALUE;
            }
        }
        Arrays.sort(nums);
        return k;
    }

    public int removeDuplicates_Streams(int[] nums) {
        Set<Integer> numsSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        nums = numsSet.stream().mapToInt(i -> i).toArray();
        return numsSet.size();
    }
}
