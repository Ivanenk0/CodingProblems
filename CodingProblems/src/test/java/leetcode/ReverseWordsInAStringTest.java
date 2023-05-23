package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>151. Reverse Words in a String</b>
 * <p>
 * <a href="https://leetcode.com/problems/reverse-words-in-a-string/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * @see leetcode.ReverseWordsInAString
 */
public class ReverseWordsInAStringTest {

    private final ReverseWordsInAString solution = new ReverseWordsInAString();

    @Test
    public void reverseWords_Testcase1() {
        String s = "the sky is blue";
        String actualOutput = solution.reverseWords(s);
        String expectedOutput = "blue is sky the";

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void reverseWords_Testcase2() {
        String s = "  hello world  ";
        String actualOutput = solution.reverseWords(s);
        String expectedOutput = "world hello";

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void reverseWords_Testcase3() {
        String s = "a good   example";
        String actualOutput = solution.reverseWords(s);
        String expectedOutput = "example good a";

        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
