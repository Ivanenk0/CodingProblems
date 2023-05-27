package leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <b>1456. Maximum Number of Vowels in a Substring of Given Length</b>
 * <p>
 * <a href="https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
 * <p>
 * <b>Constraints:</b><p>
 * 1 <= s.length <= 10^5 <p>
 * s consists of lowercase English letters. <p>
 * 1 <= k <= s.length
 */
public class MaximumNumberOfVowelsInSubstringOfGivenLength {
    public int maxVowels(String s, int k) {
        final Set<Character> vowels = new HashSet<>(List.of('a', 'e', 'i', 'o', 'u'));
        char[] input = s.toCharArray();
        int windowCount = 0;
        for (int i = 0; i < k; i++) {
            if (vowels.contains(input[i])) windowCount++;
        }
        int result = windowCount;
        for (int i = k; i < input.length; i++) {
            if (vowels.contains(input[i-k])) {
                windowCount--;
            }
            if (vowels.contains(input[i])) {
                windowCount++;
            }
            result = Math.max(result, windowCount);
        }
        return result;
    }
}
