package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>27. Remove Element</b>
 * <p>
 * <a href="https://leetcode.com/problems/remove-element/?envType=study-plan-v2&id=top-interview-150">LeetCode Problem</a>
 * <p>
 * @see leetcode.RemoveElement
 */
public class RemoveElementTest {

    private final RemoveElement solution = new RemoveElement();

    @Test
    public void removeElement_Testcase1() {
        int[] nums = {3,2,2,3};
        int val = 3;
        int actualOutput = solution.removeElement(nums, val);
        int expectedOutput = 2;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void removeElement_Testcase2() {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int actualOutput = solution.removeElement(nums, val);
        int expectedOutput = 5;

        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
