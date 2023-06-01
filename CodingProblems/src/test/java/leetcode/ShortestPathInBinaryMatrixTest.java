package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>1091. Shortest Path in Binary Matrix</b>
 * <p>
 * <a href="https://leetcode.com/problems/shortest-path-in-binary-matrix">LeetCode Problem</a>
 * <p>
 *
 * @see leetcode.ShortestPathInBinaryMatrix
 */
public class ShortestPathInBinaryMatrixTest {

    private final ShortestPathInBinaryMatrix solution = new ShortestPathInBinaryMatrix();

    @Test
    public void shortestPathBinaryMatrix_Testcase1() {
        int[][] grid = {{0, 1}, {1, 0}};
        int actualOutput = solution.shortestPathBinaryMatrix(grid);
        int expectedOutput = 2;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shortestPathBinaryMatrix_Testcase2() {
        int[][] grid = {{0, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        int actualOutput = solution.shortestPathBinaryMatrix(grid);
        int expectedOutput = 4;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shortestPathBinaryMatrix_Testcase3() {
        int[][] grid = {{1, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        int actualOutput = solution.shortestPathBinaryMatrix(grid);
        int expectedOutput = -1;

        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
