package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>1768. Merge Strings Alternately</b>
 * <p>
 * <a href="https://leetcode.com/problems/merge-strings-alternately/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * @see leetcode.MergeStringsAlternately
 */
public class MergeStringsAlternatelyTest {

    private final MergeStringsAlternately solution = new MergeStringsAlternately();

    @Test
    public void mergeAlternately_Testcase1() {
        String word1 = "abc";
        String word2 = "pqr";
        String actualOutput = solution.mergeAlternately(word1,word2);
        String expectedOutput = "apbqcr";

        Assert.assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void mergeAlternately_Testcase2() {
        String word1 = "ab";
        String word2 = "pqrs";
        String actualOutput = solution.mergeAlternately(word1,word2);
        String expectedOutput = "apbqrs";

        Assert.assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void mergeAlternately_Testcase3() {
        String word1 = "abcd";
        String word2 = "pq";
        String actualOutput = solution.mergeAlternately(word1,word2);
        String expectedOutput = "apbqcd";

        Assert.assertEquals(expectedOutput,actualOutput);
    }
}
