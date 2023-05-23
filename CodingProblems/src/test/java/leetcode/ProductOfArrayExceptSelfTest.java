package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>238. Product of Array Except Self</b>
 * <p>
 * <a href="https://leetcode.com/problems/product-of-array-except-self/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * @see leetcode.ProductOfArrayExceptSelf
 */
public class ProductOfArrayExceptSelfTest {

    private final ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();

    @Test
    public void productExceptSelf_Testcase1() {
        int[] nums = {1,2,3,4};
        int[] actualOutput = solution.productExceptSelf(nums);
        int[] expectedOutput = {24,12,8,6};

        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void productExceptSelf_Testcase2() {
        int[] nums = {-1,1,0,-3,3};
        int[] actualOutput = solution.productExceptSelf(nums);
        int[] expectedOutput = {0,0,9,0,0};

        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void productExceptSelf_Testcase3() {
        int[] nums = {5,7,9};
        int[] actualOutput = solution.productExceptSelf(nums);
        int[] expectedOutput = {63,45,35};

        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }
}
