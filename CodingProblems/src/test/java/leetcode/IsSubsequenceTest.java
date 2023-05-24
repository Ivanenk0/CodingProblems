package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>392. Is Subsequence</b>
 * <p>
 * <a href="https://leetcode.com/problems/is-subsequence">LeetCode Problem</a>
 * <p>
 * @see leetcode.IsSubsequence
 */
public class IsSubsequenceTest {

    private final IsSubsequence solution = new IsSubsequence();

    @Test
    public void isSubsequence_Testcase1() {
        String s = "abc";
        String t = "ahbgdc";
        boolean actualOutput = solution.isSubsequence(s, t);
        boolean expectedOutput = true;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void isSubsequence_Testcase2() {
        String s = "axc";
        String t = "ahbgdc";
        boolean actualOutput = solution.isSubsequence(s, t);
        boolean expectedOutput = false;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void isSubsequence_Testcase3() {
        String s = "acbxfsa";
        String t = "ahbgdc";
        boolean actualOutput = solution.isSubsequence(s, t);
        boolean expectedOutput = false;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void isSubsequence_Testcase4() {
        String s = "aaaaaa";
        String t = "bbaaaa";
        boolean actualOutput = solution.isSubsequence(s, t);
        boolean expectedOutput = false;

        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
