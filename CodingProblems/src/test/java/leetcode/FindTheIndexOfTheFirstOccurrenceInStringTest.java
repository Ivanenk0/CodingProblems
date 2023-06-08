package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>28. Find the Index of the First Occurrence in a String</b>
 * <p>
 * <a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string">LeetCode Problem</a>
 * <p>
 *
 * @see leetcode.FindTheIndexOfTheFirstOccurrenceInString
 */
public class FindTheIndexOfTheFirstOccurrenceInStringTest {

    private final FindTheIndexOfTheFirstOccurrenceInString solution = new FindTheIndexOfTheFirstOccurrenceInString();

    @Test
    public void strStr_Testcase1() {
        String haystack = "sadbutsad";
        String needle = "sad";
        int actualOutput = solution.strStr(haystack, needle);
        int expectedOutput = 0;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void strStr_Testcase2() {
        String haystack = "leetcode";
        String needle = "leeto";
        int actualOutput = solution.strStr(haystack, needle);
        int expectedOutput = -1;

        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
