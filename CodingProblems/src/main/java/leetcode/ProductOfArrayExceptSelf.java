package leetcode;

/**
 * <b>238. Product of Array Except Self</b>
 * <p>
 * <a href="https://leetcode.com/problems/product-of-array-except-self/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * Given an integer array nums,
 * return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * <p>
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * <p>
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * <p>
 * <b>Constraints:</b><p>
 * 2 <= nums.length <= 105 <p>
 * -30 <= nums[i] <= 30 <p>
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        if (len == 1) return nums;
        int[] result = new int[len];

        for (int i = 0, left = 1; i < len; ++i) {
            result[i] = left;
            left *= nums[i];
        }
        for (int i = len - 1, right = 1; i >= 0; --i) {
            result[i] *= right;
            right *= nums[i];
        }
        return result;
    }

    public int[] productExceptSelfAlternative(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        for(int i = 0; i < len; i++) {
            int product = 1;
            for(int j = 0; j < len; j++) {
                if (j != i) continue;
                product *= nums[j];
            }
            result[i] = product;
        }
        return result;
    }
}
