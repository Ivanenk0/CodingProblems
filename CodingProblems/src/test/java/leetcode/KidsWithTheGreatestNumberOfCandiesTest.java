package leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <b>1431. Kids With the Greatest Number of Candies</b>
 * <p>
 * <a href="https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * @see leetcode.KidsWithTheGreatestNumberOfCandies
 */
public class KidsWithTheGreatestNumberOfCandiesTest {

    private final KidsWithTheGreatestNumberOfCandies solution = new KidsWithTheGreatestNumberOfCandies();

    @Test
    public void kidsWithCandies_Testcase1() {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> actualOutput = solution.kidsWithCandies(candies, extraCandies);
        List<Boolean> expectedOutput = new ArrayList<>(Arrays.asList(true,true,true,false,true));

        Assert.assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void kidsWithCandies_Testcase2() {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        List<Boolean> actualOutput = solution.kidsWithCandies(candies, extraCandies);
        List<Boolean> expectedOutput = new ArrayList<>(Arrays.asList(true,false,false,false,false));

        Assert.assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void kidsWithCandies_Testcase3() {
        int[] candies = {12,1,12};
        int extraCandies = 10;
        List<Boolean> actualOutput = solution.kidsWithCandies(candies, extraCandies);
        List<Boolean> expectedOutput = new ArrayList<>(Arrays.asList(true,false,true));

        Assert.assertEquals(expectedOutput,actualOutput);
    }
}
