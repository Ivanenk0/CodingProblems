package leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * <b>228. Summary Ranges</b>
 * <p>
 * <a href="https://leetcode.com/problems/summary-ranges">LeetCode Problem</a>
 * <p>
 * @see leetcode.SummaryRanges
 */
public class SummaryRangesTest {

    private final SummaryRanges solution = new SummaryRanges();

    @Test
    public void summaryRanges_Testcase1() {
        int[] nums = {0,1,2,4,5,7};
        List<String> actualOutput = solution.summaryRanges(nums);
        List<String> expectedOutput = List.of("0->2","4->5","7");

        Assert.assertEquals(expectedOutput , actualOutput);
    }

    @Test
    public void summaryRanges_Testcase2() {
        int[] nums = {0,2,3,4,6,8,9};
        List<String> actualOutput = solution.summaryRanges(nums);
        List<String> expectedOutput = List.of("0","2->4","6","8->9");

        Assert.assertEquals(expectedOutput , actualOutput);
    }
}
