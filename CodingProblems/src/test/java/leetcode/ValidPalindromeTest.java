package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>125. Valid Palindrome</b>
 * <p>
 * <a href="https://leetcode.com/problems/valid-palindrome">LeetCode Problem</a>
 * <p>
 * @see leetcode.ValidPalindrome
 */
public class ValidPalindromeTest {

    private final ValidPalindrome solution = new ValidPalindrome();

    @Test
    public void isPalindrome_Testcase1() {
        String s = "A man, a plan, a canal: Panama";
        boolean actualOutput = solution.isPalindrome(s);
        boolean expectedOutput = true;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void isPalindrome_Testcase2() {
        String s = "race a car";
        boolean actualOutput = solution.isPalindrome(s);
        boolean expectedOutput = false;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void isPalindrome_Testcase3() {
        String s = " ";
        boolean actualOutput = solution.isPalindrome(s);
        boolean expectedOutput = true;

        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
