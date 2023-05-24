package leetcode;

/**
 * <b>392. Is Subsequence</b>
 * <p>
 * <a href="https://leetcode.com/problems/is-subsequence">LeetCode Problem</a>
 * <p>
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * <p>
 * A subsequence of a string is a new string that is formed from the original string by
 * deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters.
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 * <p>
 * <b>Constraints:</b><p>
 * 0 <= s.length <= 100 <p>
 * 0 <= t.length <= 104 <p>
 * s and t consist only of lowercase English letters.
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.equals(t) || s.length() < 1) return true;
        int subsequenceIndex = 0;
        for(int i = 0; i < t.length(); i++) {
            if(t.charAt(i) == s.charAt(subsequenceIndex)) subsequenceIndex++;
            if(subsequenceIndex == s.length()) return true;
        }
        return false;
    }
}
