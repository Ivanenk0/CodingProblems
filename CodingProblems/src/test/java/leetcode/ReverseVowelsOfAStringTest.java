package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>345. Reverse Vowels of a String</b>
 * <p>
 * <a href="https://leetcode.com/problems/reverse-vowels-of-a-string/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * @see leetcode.ReverseVowelsOfAString
 */
public class ReverseVowelsOfAStringTest {

    private final ReverseVowelsOfAString solution = new ReverseVowelsOfAString();

    @Test
    public void reverseVowels_Testcase1() {
        String word = "hello";
        String actualOutput = solution.reverseVowels(word);
        String expectedOutput = "holle";

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void reverseVowels_Testcase2() {
        String word = "leetcode";
        String actualOutput = solution.reverseVowels(word);
        String expectedOutput = "leotcede";

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void reverseVowels_Testcase3() {
        String word = "Hello World";
        String actualOutput = solution.reverseVowels(word);
        String expectedOutput = "Hollo Werld";

        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
