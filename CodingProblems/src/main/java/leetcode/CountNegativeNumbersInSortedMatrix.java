package leetcode;

/**
 * <b>1351. Count Negative Numbers in a Sorted Matrix</b>
 * <p>
 * <a href="https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/">LeetCode Problem</a>
 * <p>
 * Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise,
 * return the number of negative numbers in grid.
 * <p>
 * <b>Constraints:</b><p>
 * m == grid.length <p>
 * n == grid[i].length <p>
 * 1 <= m, n <= 100 <p>
 * -100 <= grid[i][j] <= 100
 */
public class CountNegativeNumbersInSortedMatrix {
    public int countNegatives(int[][] grid) {
        int row = 0;
        int col = grid[row].length- 1;
        int negativeCounter = 0;

        while (row < grid.length && col >= 0) {
            if (grid[row][col] < 0) {
                negativeCounter += grid.length - row;
                col--;
            } else {
                row++;
            }
        }

        return negativeCounter;
    }
}
