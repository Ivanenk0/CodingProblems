package leetcode;

/**
 * <b>1232. Check If It Is a Straight Line</b>
 * <p>
 * <a href="https://leetcode.com/problems/check-if-it-is-a-straight-line">LeetCode Problem</a>
 * <p>
 * You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point.
 * Check if these points make a straight line in the XY plane.
 * <p>
 * <b>Constraints:</b><p>
 * 2 <= coordinates.length <= 1000 <p>
 * coordinates[i].length == 2<p>
 * -10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4 <p>
 * coordinates contains no duplicate point.
 */
public class CheckIfItIsAStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        int xDiff = coordinates[1][0] - coordinates[0][0];
        int yDiff = coordinates[1][1] - coordinates[0][1];

        for (int i = 2; i < coordinates.length; i++) {
            if (xDiff * (coordinates[i][1] - coordinates[0][1]) !=
                    yDiff * (coordinates[i][0] - coordinates[0][0])) {
                return false;
            }
        }

        return true;
    }
}
