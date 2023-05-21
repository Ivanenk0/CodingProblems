package leetcode;

/**
 * <b>1071. Greatest Common Divisor of Strings</b>
 * <p>
 * <a href="https://leetcode.com/problems/greatest-common-divisor-of-strings/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * For two strings s and t, we say "t divides s" if and only if s = t + ... + t
 * (i.e., t is concatenated with itself one or more times).
 * <p>
 * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 * <p>
 * <b>Constraints:</b><p>
 * 1 <= str1.length, str2.length <= 1000;   <p>
 * str1 and str2 consist of English uppercase letters.
 */
public class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        for(int i = Math.min(len1, len2); i > 0; i-- ) {
            if((len1 % i == 0) && (len2 % i == 0)) {
                String result = str1.substring(0, i);
                if(str1.replace(result,"").isEmpty() &&
                        str2.replace(result,"").isEmpty()) {
                    return result;
                }
            }
        }
        return "";
    }
}
