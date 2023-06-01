package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <b>1091. Shortest Path in Binary Matrix</b>
 * <p>
 * <a href="https://leetcode.com/problems/shortest-path-in-binary-matrix">LeetCode Problem</a>
 * <p>
 * Given an n x n binary matrix grid,
 * return the length of the shortest clear path in the matrix.
 * If there is no clear path, return -1.
 * <p>
 * A clear path in a binary matrix is a path from the top-left cell (i.e., (0, 0))
 * to the bottom-right cell (i.e., (n - 1, n - 1))
 * <p>
 * <b>Constraints:</b><p>
 * n == grid.length <p>
 * n == grid[i].length <p>
 * 1 <= n <= 100 <p>
 * grid[i][j] is 0 or 1
 */
public class ShortestPathInBinaryMatrix {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int gridLength = grid.length;
        // Return -1 if Start or Destination point != 0
        if (grid[0][0] == 1 || grid[gridLength - 1][gridLength - 1] == 1) return -1;

        // Init new Queue for storing current position & amount of steps
        Queue<int[]> position = new LinkedList<>();
        position.offer(new int[]{0, 0, 1});
        grid[0][0] = 1;

        // Array with possible directions to move inside matrix
        int[][] directions = {
                {-1, -1}, {-1, 0}, {-1, 1},
                {0, -1},           {0, 1},
                {1, -1},  {1, 0},  {1, 1}
        };


        while (!position.isEmpty()) {
            int[] current = position.poll();
            int row = current[0];
            int col = current[1];
            int steps = current[2];

            for (int[] direction : directions) {
                int newRow = row + direction[0];
                int newCol = col + direction[1];

                // Return amount of steps if we reach destination point (bottom-right cell)
                if (row == gridLength - 1 && col == gridLength - 1) {
                    return steps;
                }

                // Check if next position isn't out of grid bound && this position == 0
                if (newRow >= 0 && newRow < gridLength &&
                        newCol >= 0 && newCol < gridLength &&
                        grid[newRow][newCol] == 0) {
                    grid[newRow][newCol] = 1;
                    position.offer(new int[]{newRow, newCol, steps + 1});
                }
            }
        }

        return -1;
    }
}
