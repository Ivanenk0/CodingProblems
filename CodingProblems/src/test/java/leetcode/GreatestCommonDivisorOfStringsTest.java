package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>1071. Greatest Common Divisor of Strings</b>
 * <p>
 * <a href="https://leetcode.com/problems/greatest-common-divisor-of-strings/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * @see leetcode.GreatestCommonDivisorOfStrings
 */
public class GreatestCommonDivisorOfStringsTest {

    private final GreatestCommonDivisorOfStrings solution = new GreatestCommonDivisorOfStrings();

    @Test
    public void gcdOfStrings_Testcase1(){
        String str1 = "ABCABC";
        String str2 = "ABC";
        String actualOutput = solution.gcdOfStrings(str1,str2);
        String expectedOutput = "ABC";

        Assert.assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void gcdOfStrings_Testcase2(){
        String str1 = "ABABAB";
        String str2 = "ABAB";
        String actualOutput = solution.gcdOfStrings(str1,str2);
        String expectedOutput = "AB";

        Assert.assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void gcdOfStrings_Testcase3(){
        String str1 = "LEET";
        String str2 = "CODE";
        String actualOutput = solution.gcdOfStrings(str1,str2);
        String expectedOutput = "";

        Assert.assertEquals(expectedOutput,actualOutput);
    }
}
