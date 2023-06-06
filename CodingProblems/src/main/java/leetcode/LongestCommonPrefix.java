package leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <b>14. Longest Common Prefix</b>
 * <p>
 * <a href="https://leetcode.com/problems/longest-common-prefix">LeetCode Problem</a>
 * <p>
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * <p>
 * <b>Constraints:</b><p>
 * 1 <= strs.length <= 200 <p>
 * 0 <= strs[i].length <= 200 <p>
 * strs[i] consists of only lowercase English letters.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        /*
            Use StringBulder instead of String, if you plan to modify this variable in the future.
            String - immutable class
            StringBuilder - mutable
        */
        StringBuilder answer = new StringBuilder();

        //  Find the shortest word in strs[] using Java Stream API.
        String shortestWord = Arrays.stream(strs)
                .min(Comparator.comparing(String::length))
                .get();

        //  You can peek any word to iterate through each Character in it ( e.g. strs[0] ).
        for (int i = 0 ; i < shortestWord.length(); i++) {
            char currentChar = strs[0].charAt(i);

            // Check if each word in strs[] contains current Character in same position.
            for (String word : strs) {
                if (word.charAt(i) != currentChar) {
                    return answer.toString();
                }
            }

            // Append answer with the current Character if it passed.
            answer.append(currentChar);
        }
        return answer.toString();
    }
}
