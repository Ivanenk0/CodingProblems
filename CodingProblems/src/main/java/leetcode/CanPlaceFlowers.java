package leetcode;

/**
 * <b>605. Can Place Flowers</b>
 * <p>
 * <a href="https://leetcode.com/problems/can-place-flowers/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * You have a long flowerbed in which some of the plots are planted, and some are not.
 * However, flowers cannot be planted in adjacent plots.
 * <p>
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n,
 * return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule
 * and false otherwise.
 * <p>
 * <b>Constraints:</b><p>
 * 1 <= flowerbed.length <= 2 * 104 <p>
 * flowerbed[i] is 0 or 1. <p>
 * There are no two adjacent flowers in flowerbed. <p>
 * 0 <= n <= flowerbed.length
 */
public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 0 &&
                    (i == 0 || flowerbed[i-1] == 0) &&
                    (i == flowerbed.length-1 || flowerbed[i+1] == 0)) {
                flowerbed[i] = 1;
                n -= 1;
            }
        }
        return n <= 0;
    }
}
