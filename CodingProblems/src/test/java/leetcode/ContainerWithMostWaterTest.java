package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>11. Container With Most Water</b>
 * <p>
 * <a href="https://leetcode.com/problems/container-with-most-water/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * @see leetcode.ContainerWithMostWater
 */
public class ContainerWithMostWaterTest {

    private final ContainerWithMostWater solution = new ContainerWithMostWater();

    @Test
    public void maxArea_Testcase1() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int actualOutput = solution.maxArea(height);
        int expectedOutput = 49;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void maxArea_Testcase2() {
        int[] height = {1,1};
        int actualOutput = solution.maxArea(height);
        int expectedOutput = 1;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void maxArea_Testcase3() {
        int[] height = {6,2,5,3,7};
        int actualOutput = solution.maxArea(height);
        int expectedOutput = 24;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void maxArea_Testcase4() {
        int[] height = {6,2,5,3,5};
        int actualOutput = solution.maxArea(height);
        int expectedOutput = 20;

        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
