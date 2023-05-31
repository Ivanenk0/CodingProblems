package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>58. Length of Last Word</b>
 * <p>
 * <a href="https://leetcode.com/problems/length-of-last-word">LeetCode Problem</a>
 * <p>
 *
 * @see leetcode.LengthOfLastWord
 */
public class LengthOfLastWordTest {

    private final LengthOfLastWord solution = new LengthOfLastWord();

    @Test
    public void lengthOfLastWord_Testcase1() {
        String s = "Hello World";
        int actualOutput = solution.lengthOfLastWord(s);
        int expectedOutput = 5;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void lengthOfLastWord_Testcase2() {
        String s = "   fly me   to   the moon  ";
        int actualOutput = solution.lengthOfLastWord(s);
        int expectedOutput = 4;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void lengthOfLastWord_Testcase3() {
        String s = "luffy is still joyboy";
        int actualOutput = solution.lengthOfLastWord(s);
        int expectedOutput = 6;

        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
