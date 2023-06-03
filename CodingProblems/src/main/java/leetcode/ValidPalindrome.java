package leetcode;

/**
 * <b>125. Valid Palindrome</b>
 * <p>
 * <a href="https://leetcode.com/problems/valid-palindrome">LeetCode Problem</a>
 * <p>
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
 * removing all non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 * <p>
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * <p>
 * <b>Constraints:</b><p>
 * 1 <= s.length <= 2 * 10^5 <p>
 * s consists only of printable ASCII characters.
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder reversed = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString().equals(s);
    }
}
