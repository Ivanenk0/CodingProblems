package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>169. Majority Element</b>
 * <p>
 * <a href="https://leetcode.com/problems/majority-element">LeetCode Problem</a>
 * <p>
 *
 * @see leetcode.MajorityElement
 */
public class MajorityElementTest {

    private final MajorityElement solution = new MajorityElement();

    @Test
    public void majorityElement_Testcase1() {
        int[] nums = {3,2,3};
        int actualOutput = solution.majorityElement(nums);
        int expectedOutput = 3;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void majorityElement_Testcase2() {
        int[] nums = {2,2,1,1,1,2,2};
        int actualOutput = solution.majorityElement(nums);
        int expectedOutput = 2;

        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
