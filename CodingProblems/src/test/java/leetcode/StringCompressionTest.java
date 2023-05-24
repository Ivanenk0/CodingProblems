package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>443. String Compression</b>
 * <p>
 * <a href="https://leetcode.com/problems/string-compression/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * @see leetcode.StringCompression
 */
public class StringCompressionTest {

    private final StringCompression solution = new StringCompression();

    @Test
    public void compress_Testcase1() {
        char[] chars = {'a','a','b','b','c','c','c'};
        int actualOutput = solution.compress(chars);
        int expectedOutput = 6;

        Assert.assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void compress_Testcase2() {
        char[] chars = {'a'};
        int actualOutput = solution.compress(chars);
        int expectedOutput = 1;

        Assert.assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void compress_Testcase3() {
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        int actualOutput = solution.compress(chars);
        int expectedOutput = 4;

        Assert.assertEquals(expectedOutput,actualOutput);
    }
}
