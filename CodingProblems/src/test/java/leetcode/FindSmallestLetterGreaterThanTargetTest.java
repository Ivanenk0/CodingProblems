package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>744. Find Smallest Letter Greater Than Target</b>
 * <p>
 * <a href="https://leetcode.com/problems/find-smallest-letter-greater-than-target">LeetCode Problem</a>
 * <p>
 *
 * @see leetcode.FindSmallestLetterGreaterThanTarget
 */
public class FindSmallestLetterGreaterThanTargetTest {

    private final FindSmallestLetterGreaterThanTarget solution = new FindSmallestLetterGreaterThanTarget();

    @Test
    public void nextGreatestLetter_Testcase1() {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        char actualOutput = solution.nextGreatestLetter(letters, target);
        char expectedOutput = 'c';

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void nextGreatestLetter_Testcase2() {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        char actualOutput = solution.nextGreatestLetter(letters, target);
        char expectedOutput = 'f';

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void nextGreatestLetter_Testcase3() {
        char[] letters = {'x', 'x', 'y', 'y'};
        char target = 'z';
        char actualOutput = solution.nextGreatestLetter(letters, target);
        char expectedOutput = 'x';

        Assert.assertEquals(expectedOutput, actualOutput);
    }

}
