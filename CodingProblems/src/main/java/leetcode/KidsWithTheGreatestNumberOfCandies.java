package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>1431. Kids With the Greatest Number of Candies</b>
 * <p>
 * <a href="https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * There are n kids with candies.
 * You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has,
 * and an integer extraCandies, denoting the number of extra candies that you have.
 * <p>
 * Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies,
 * they will have the greatest number of candies among all the kids, or false otherwise.
 * <p>
 * <b>Constraints:</b><p>
 * n == candies.length <p>
 * 2 <= n <= 100 <p>
 * 1 <= candies[i] <= 100 <p>
 * 1 <= extraCandies <= 50
 */
public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        for(int kid = 0; kid < candies.length; kid++) {
            int avardedKid = candies[kid]+extraCandies;
            int greatestKid = 0;
            for(int candie : candies) {
                if(greatestKid < candie) greatestKid = candie;
            }
            result.add(greatestKid <= avardedKid);
        }
        return result;
    }
}
