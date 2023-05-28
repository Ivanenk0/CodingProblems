package leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * <b>2215. Find the Difference of Two Arrays</b>
 * <p>
 * <a href="https://leetcode.com/problems/find-the-difference-of-two-arrays/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 *
 * @see leetcode.FindTheDifferenceOfTwoArrays
 */
public class FindTheDifferenceOfTwoArraysTest {

    private final FindTheDifferenceOfTwoArrays solution = new FindTheDifferenceOfTwoArrays();

    @Test
    public void findDifference_Testcase1() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        List<List<Integer>> actualOutput = solution.findDifference(nums1, nums2);
        List<List<Integer>> expectedOutput = Arrays.asList(List.of(1, 3), List.of(4, 6));

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void findDifference_Testcase2() {
        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {1, 1, 2, 2};
        List<List<Integer>> actualOutput = solution.findDifference(nums1, nums2);
        List<List<Integer>> expectedOutput = Arrays.asList(List.of(3), List.of());

        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
