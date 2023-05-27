package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>1456. Maximum Number of Vowels in a Substring of Given Length</b>
 * <p>
 * <a href="https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 *
 * @see leetcode.MaximumNumberOfVowelsInSubstringOfGivenLength
 */
public class MaximumNumberOfVowelsInSubstringOfGivenLengthTest {

    private final MaximumNumberOfVowelsInSubstringOfGivenLength solution = new MaximumNumberOfVowelsInSubstringOfGivenLength();

    @Test
    public void maxVowels_Testcase1() {
        String s = "abciiidef";
        int k = 3;
        int actualOutput = solution.maxVowels(s, k);
        int expectedOutput = 3;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void maxVowels_Testcase2() {
        String s = "aeiou";
        int k = 2;
        int actualOutput = solution.maxVowels(s, k);
        int expectedOutput = 2;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void maxVowels_Testcase3() {
        String s = "leetcode";
        int k = 3;
        int actualOutput = solution.maxVowels(s, k);
        int expectedOutput = 2;

        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
