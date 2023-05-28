package leetcode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <b>1207. Unique Number of Occurrences</b>
 * <p>
 * <a href="https://leetcode.com/problems/unique-number-of-occurrences/?envType=study-plan-v2&id=leetcode-75">LeetCode Problem</a>
 * <p>
 * Given an array of integers arr, return true if
 * the number of occurrences of each value in the array is unique or false otherwise.
 * <p>
 * <b>Constraints:</b><p>
 * 1 <= arr.length <= 1000 <p>
 * -1000 <= arr[i] <= 1000
 */
public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> setArr = IntStream.of(arr).boxed().collect(Collectors.toSet());
        List<Integer> repeatList = new ArrayList<>();
        for (int i : setArr) {
            int repeatCount = 0;
            for (int k : arr) {
                if (i == k) repeatCount++;
            }
            repeatList.add(repeatCount);
        }
        return repeatList.size() == repeatList.stream().collect(Collectors.toSet()).size();
    }
}
