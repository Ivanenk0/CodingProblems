package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>14. Longest Common Prefix</b>
 * <p>
 * <a href="https://leetcode.com/problems/longest-common-prefix">LeetCode Problem</a>
 * <p>
 *
 * @see leetcode.LongestCommonPrefix
 */
public class LongestCommonPrefixTest {

    private final LongestCommonPrefix solution = new LongestCommonPrefix();

    @Test
    public void longestCommonPrefix_Testcase1() {
        String[] strs = {"flower", "flow", "flight"};
        String actualOutput = solution.longestCommonPrefix(strs);
        String expectedOutput = "fl";

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void longestCommonPrefix_Testcase2() {
        String[] strs = {"dog", "racecar", "car"};
        String actualOutput = solution.longestCommonPrefix(strs);
        String expectedOutput = "";

        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
