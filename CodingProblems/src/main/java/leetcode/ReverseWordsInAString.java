package leetcode;

/**
 * <b>151. Reverse Words in a String</b>
 * <p>
 * <a href="https://leetcode.com/problems/reverse-words-in-a-string/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * Given an input string s, reverse the order of the words.
 * <p>
 * A word is defined as a sequence of non-space characters.
 * The words in s will be separated by at least one space.
 * Return a string of the words in reverse order concatenated by a single space.
 * <p>
 * <b>Constraints:</b><p>
 * 1 <= s.length <= 104 <p>
 * s contains English letters (upper-case and lower-case), digits, and spaces ' '. <p>
 * There is at least one word in s.
 */
public class ReverseWordsInAString {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] words = s.split("\\s+");
        for(int i = words.length-1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }
        return result.toString().trim();
    }
}
