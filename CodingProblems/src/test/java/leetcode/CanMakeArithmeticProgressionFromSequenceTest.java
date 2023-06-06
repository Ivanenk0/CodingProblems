package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>1502. Can Make Arithmetic Progression From Sequence</b>
 * <p>
 * <a href="https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/">LeetCode Problem</a>
 * <p>
 *
 * @see leetcode.CanMakeArithmeticProgressionFromSequence
 */
public class CanMakeArithmeticProgressionFromSequenceTest {

    private final CanMakeArithmeticProgressionFromSequence solution = new CanMakeArithmeticProgressionFromSequence();

    @Test
    public void canMakeArithmeticProgression_testcase1() {
        int[] arr = {3, 5, 1};
        boolean actualOutput = solution.canMakeArithmeticProgression(arr);
        boolean expectedOutput = true;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void canMakeArithmeticProgression_testcase2() {
        int[] arr = {1, 2, 4};
        boolean actualOutput = solution.canMakeArithmeticProgression(arr);
        boolean expectedOutput = false;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void canMakeArithmeticProgression_testcase3() {
        int[] arr = {-13, -17, -8, -10, -20, 2, 3, -19, 2, -18, -5, 7, -12, 18, -17, 12, -1};
        boolean actualOutput = solution.canMakeArithmeticProgression(arr);
        boolean expectedOutput = false;

        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
