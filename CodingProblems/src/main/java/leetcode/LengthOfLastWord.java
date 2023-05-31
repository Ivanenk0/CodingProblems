package leetcode;

/**
 * <b>58. Length of Last Word</b>
 * <p>
 * <a href="https://leetcode.com/problems/length-of-last-word">LeetCode Problem</a>
 * <p>
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * <p>
 * A word is a maximal substring consisting of non-space characters only.
 * <p>
 * <b>Constraints:</b><p>
 * 1 <= s.length <= 10^4 <p>
 * s consists of only English letters and spaces ' '. <p>
 * There will be at least one word in s.
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] words = s.split("\\s+");
        return words[words.length-1].length();
    }
}
