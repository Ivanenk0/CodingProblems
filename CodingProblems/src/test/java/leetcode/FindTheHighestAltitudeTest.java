package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>1732. Find the Highest Altitude</b>
 * <p>
 * <a href="https://leetcode.com/problems/find-the-highest-altitude/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * @see leetcode.FindTheHighestAltitude
 */
public class FindTheHighestAltitudeTest {

    private final FindTheHighestAltitude solution = new FindTheHighestAltitude();

    @Test
    public void largestAltitude_Testcase1() {
        int[] gain = {-5,1,5,0,-7};
        int actualOutput = solution.largestAltitude(gain);
        int expectedOutput = 1;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void largestAltitude_Testcase2() {
        int[] gain = {2,-3,5,11,-10};
        int actualOutput = solution.largestAltitude(gain);
        int expectedOutput = 15;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void largestAltitude_Testcase3() {
        int[] gain = {-3,2,1};
        int actualOutput = solution.largestAltitude(gain);
        int expectedOutput = 0;

        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
