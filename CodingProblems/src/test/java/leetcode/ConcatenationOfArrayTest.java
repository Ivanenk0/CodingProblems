package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>1929. Concatenation of Array</b>
 * <p>
 * <a href="https://leetcode.com/problems/concatenation-of-array/">LeetCode Problem</a>
 * <p>
 *
 * @see leetcode.ConcatenationOfArray
 */
public class ConcatenationOfArrayTest {

    private final ConcatenationOfArray solution = new ConcatenationOfArray();

    @Test
    public void getConcatenation_Testcase1() {
        int[] nums = {1, 2, 1};
        int[] actualOutput = solution.getConcatenation(nums);
        int[] expectedOutput = {1, 2, 1, 1, 2, 1};

        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void getConcatenation_Testcase2() {
        int[] nums = {1, 3, 2, 1};
        int[] actualOutput = solution.getConcatenation(nums);
        int[] expectedOutput = {1, 3, 2, 1, 1, 3, 2, 1};

        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void getConcatenation_Testcase3() {
        int[] nums = {2, 6, 8, 3};
        int[] actualOutput = solution.getConcatenation(nums);
        int[] expectedOutput = {2, 6, 8, 3, 2, 6, 8, 3};

        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }

}
