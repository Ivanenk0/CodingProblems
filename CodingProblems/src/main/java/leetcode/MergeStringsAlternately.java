package leetcode;

/**
 * <b>1768. Merge Strings Alternately</b>
 * <p>
 * <a href="https://leetcode.com/problems/merge-strings-alternately/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * You are given two strings word1 and word2.
 * Merge the strings by adding letters in alternating order, starting with word1.
 * If a string is longer than the other, append the additional letters onto the end of the merged string.
 * <p>
 * Return the merged string.
 * <p>
 * <b>Constraints:</b><p>
 * 1 <= word1.length, word2.length <= 100;  <p>
 * word1 and word2 consist of lowercase English letters.
 */
public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        StringBuilder result = new StringBuilder();
        while (word1.length() > i || word2.length() > i) {
            if(word1.length() > i) {
                result.append(word1.charAt(i));
            }
            if(word2.length() > i) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return new String(result);
        
    }
}
