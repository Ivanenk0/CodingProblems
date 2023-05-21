package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>605. Can Place Flowers</b>
 * <p>
 * <a href="https://leetcode.com/problems/can-place-flowers/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * @see leetcode.CanPlaceFlowers
 */
public class CanPlaceFlowersTest {

    private final CanPlaceFlowers solution = new CanPlaceFlowers();

    @Test
    public void canPlaceFlowers_Testcase1() {
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;
        boolean actualOutput = solution.canPlaceFlowers(flowerbed, n);
        boolean expectedOutput = true;

        Assert.assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void canPlaceFlowers_Testcase2() {
        int[] flowerbed = {1,0,0,0,1};
        int n = 2;
        boolean actualOutput = solution.canPlaceFlowers(flowerbed, n);
        boolean expectedOutput = false;

        Assert.assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void canPlaceFlowers_Testcase3() {
        int[] flowerbed = {1,0,1,0,0};
        int n = 1;
        boolean actualOutput = solution.canPlaceFlowers(flowerbed, n);
        boolean expectedOutput = true;

        Assert.assertEquals(expectedOutput,actualOutput);
    }
}
