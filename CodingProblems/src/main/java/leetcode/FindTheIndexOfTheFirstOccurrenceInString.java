package leetcode;

/**
 * <b>28. Find the Index of the First Occurrence in a String</b>
 * <p>
 * <a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string">LeetCode Problem</a>
 * <p>
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.
 * <p>
 * <b>Constraints:</b><p>
 * 1 <= haystack.length, needle.length <= 10^4 <p>
 * haystack and needle consist of only lowercase English characters.
 */
public class FindTheIndexOfTheFirstOccurrenceInString {
    public int strStr(String haystack, String needle) {
        int m = needle.length();
        int n = haystack.length();

        for (int windowStart = 0; windowStart <= n - m; windowStart++) {
            for (int i = 0; i < m; i++) {
                if (needle.charAt(i) != haystack.charAt(windowStart + i)) {
                    break;
                }
                if (i == m - 1) {
                    return windowStart;
                }
            }
        }

        return -1;
    }
}
