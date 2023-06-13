package leetcode;

import java.util.Arrays;

/**
 * <b>2352. Equal Row and Column Pairs</b>
 * <p>
 * <a href="https://leetcode.com/problems/equal-row-and-column-pairs">LeetCode Problem</a>
 * <p>
 * Given a 0-indexed n x n integer matrix grid,
 * return the number of pairs (ri, cj) such that row ri and column cj are equal.
 * <p>
 * A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).
 * <b>Constraints:</b><p>
 * n == grid.length == grid[i].length <p>
 * 1 <= n <= 200 <p>
 * 1 <= grid[i][j] <= 10^5
 */
public class EqualRowAndColumnPairs {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] transpose = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                //Transpose of matrix
                transpose[j][i] = grid[i][j];
            }
        }
        int ans = 0;
        for (int[] row : grid) {
            for (int[] col : transpose) {
                //Check for equality
                if (Arrays.equals(row, col)) ans++;
            }
        }
        return ans;
    }
}
