package leetcode;

import java.util.*;

/**
 * <b>2101. Detonate the Maximum Bombs</b>
 * <p>
 * <a href="https://leetcode.com/problems/detonate-the-maximum-bombs/">LeetCode Problem</a>
 * <p>
 * You are given a list of bombs. The range of a bomb is defined as the area where its effect can be felt.
 * This area is in the shape of a circle with the center as the location of the bomb.
 * <p>
 * The bombs are represented by a 0-indexed 2D integer array bombs where bombs[i] = [xi, yi, ri]. xi and yi
 * denote the X-coordinate and Y-coordinate of the location of the ith bomb, whereas ri denotes the radius of its range.
 * <p>
 * You may choose to detonate a single bomb.
 * When a bomb is detonated, it will detonate all bombs that lie in its range.
 * These bombs will further detonate the bombs that lie in their ranges.
 * <p>
 * Given the list of bombs, return the maximum number of bombs that
 * can be detonated if you are allowed to detonate only one bomb.
 * <p>
 * <b>Constraints:</b><p>
 * 1 <= bombs.length <= 100 <p>
 * bombs[i].length == 3 <p>
 * 1 <= xi, yi, ri <= 10^5
 */
public class DetonateTheMaximumBombs {
    public int maximumDetonation(int[][] bombs) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        int n = bombs.length;

        // Build the graph
        for (
                int i = 0;
                i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                int xi = bombs[i][0], yi = bombs[i][1], ri = bombs[i][2];
                int xj = bombs[j][0], yj = bombs[j][1];

                // Create a path from node i to node j, if bomb i detonates bomb j.
                if ((long) ri * ri >= (long) (xi - xj) * (xi - xj) + (long) (yi - yj) * (yi - yj)) {
                    graph.computeIfAbsent(i, k -> new ArrayList<>()).add(j);
                }
            }
        }

        int answer = 0;
        for (
                int i = 0;
                i < n; i++) {
            int count = dfs(i, new HashSet<>(), graph);
            answer = Math.max(answer, count);
        }

        return answer;
    }

    // DFS to get the number of nodes reachable from a given node cur
    private int dfs(int cur, Set<Integer> visited, Map<Integer, List<Integer>> graph) {
        visited.add(cur);
        int count = 1;
        for (int neib : graph.getOrDefault(cur, new ArrayList<>())) {
            if (!visited.contains(neib)) {
                count += dfs(neib, visited, graph);
            }
        }
        return count;
    }
}