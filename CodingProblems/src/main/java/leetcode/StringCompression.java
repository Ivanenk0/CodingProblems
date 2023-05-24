package leetcode;

/**
 * <b>443. String Compression</b>
 * <p>
 * <a href="https://leetcode.com/problems/string-compression/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * Given an array of characters chars, compress it using the following algorithm:
 * <p>
 * Begin with an empty string s. For each group of consecutive repeating characters in chars:
 * <p>
 * If the group's length is 1, append the character to s.
 * Otherwise, append the character followed by the group's length.
 * The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.
 * <p>
 * After you are done modifying the input array, return the new length of the array.
 * <p>
 * You must write an algorithm that uses only constant extra space.
 * <p>
 * <b>Constraints:</b><p>
 * 1 <= chars.length <= 2000 <p>
 * chars[i] is a lowercase English letter, uppercase English letter, digit, or symbol.
 */
public class StringCompression {
    public int compress(char[] chars) {
        if(chars.length == 1) return 1;
        int charSequence = 0;
        int internalLength = 0;
        for(int i = 0; i < chars.length; i++) {
            charSequence++;
            if(i == chars.length-1 || chars[i] != chars[i+1]) {
                if(charSequence == 1) {
                    chars[internalLength++] = chars[i];
                    charSequence = 0;
                }
                else {
                    chars[internalLength++] = chars[i];
                    for(char num : Integer.valueOf(charSequence).toString().toCharArray()) {
                        chars[internalLength++] = num;
                    }
                    charSequence = 0;
                }
            }
        }
        System.gc();
        return internalLength;
    }
}