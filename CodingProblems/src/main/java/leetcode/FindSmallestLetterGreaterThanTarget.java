package leetcode;

/**
 * <b>744. Find Smallest Letter Greater Than Target</b>
 * <p>
 * <a href="https://leetcode.com/problems/find-smallest-letter-greater-than-target">LeetCode Problem</a>
 * <p>
 * You are given an array of characters letters that is sorted in non-decreasing order, and a character target.
 * There are at least two different characters in letters.
 * <p>
 * Return the smallest character in letters that is lexicographically greater than target.
 * If such a character does not exist, return the first character in letters.
 * <p>
 * <b>Constraints:</b><p>
 * 2 <= letters.length <= 10^4 <p>
 * letters[i] is a lowercase English letter. <p>
 * letters is sorted in non-decreasing order. <p>
 * letters contains at least two different characters. <p>
 * target is a lowercase English letter.
 */
public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) return letters[i];
        }
        return letters[0];
    }
}
