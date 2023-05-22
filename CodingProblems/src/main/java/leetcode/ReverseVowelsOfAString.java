package leetcode;

import java.util.*;

/**
 * <b>345. Reverse Vowels of a String</b>
 * <p>
 * <a href="https://leetcode.com/problems/reverse-vowels-of-a-string/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * Given a string s, reverse only all the vowels in the string and return it.
 * <p>
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 * <p>
 * <b>Constraints:</b><p>
 * 1 <= s.length <= 3 * 105 <p>
 * s consist of printable ASCII characters.
 */
public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        List<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        StringBuilder vowelsList = new StringBuilder();
        StringBuilder result = new StringBuilder(s);
        for(int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                vowelsList.append(s.charAt(i));
            }
        }
        for(int i = 0, j = vowelsList.length() - 1; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                result.setCharAt(i,vowelsList.charAt(j));
                j--;
            }
        }
        return result.toString();
    }
}
