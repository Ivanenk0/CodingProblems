package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>1207. Unique Number of Occurrences</b>
 * <p>
 * <a href="https://leetcode.com/problems/unique-number-of-occurrences/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * @see leetcode.UniqueNumberOfOccurrences
 */
public class UniqueNumberOfOccurrencesTest {

    private final UniqueNumberOfOccurrences solution = new UniqueNumberOfOccurrences();

    @Test
    public void uniqueOccurrences_Testcase1() {
        int[] arr = {1,2,2,1,1,3};
        boolean actualAnswer = solution.uniqueOccurrences(arr);
        boolean expectedAnswer = true;

        Assert.assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void uniqueOccurrences_Testcase2() {
        int[] arr = {1,2};
        boolean actualAnswer = solution.uniqueOccurrences(arr);
        boolean expectedAnswer = false;

        Assert.assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void uniqueOccurrences_Testcase3() {
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        boolean actualAnswer = solution.uniqueOccurrences(arr);
        boolean expectedAnswer = true;

        Assert.assertEquals(expectedAnswer, actualAnswer);
    }
}
