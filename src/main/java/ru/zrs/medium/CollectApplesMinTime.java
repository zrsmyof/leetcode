package ru.zrs.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zrs
 */
public class CollectApplesMinTime {

    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {

        Map<Integer, List<Integer>> graph = createGraph(edges); // to store the graph
        Map<Integer, Boolean> visited = new HashMap<>();

        return dfs(graph, 0, hasApple, 0, visited); // cost of reaching the root is 0. For all others, its 2.

    }

    private int dfs(Map<Integer, List<Integer>> graph, int node, List<Boolean> hasApple, int myCost, Map<Integer, Boolean> visited) {
        Boolean v = visited.getOrDefault(node, false);
        if (v) {
            return 0;
        }
        visited.put(node, true);

        int childrenCost = 0; // cost of traversing all children.

        for (int n : graph.getOrDefault(node, new ArrayList<>())) {
            childrenCost += dfs(graph, n, hasApple, 2, visited); // check recursively for all apples in subtrees.
        }

        if (childrenCost == 0 && hasApple.get(node) == false) {
            // If no child has apples, then we won't traverse the subtree, so cost will be zero.
            // similarly, if current node also does not have the apple, we won't traverse this branch at all, so cost will be zero.
            return 0;
        }

        return childrenCost + myCost;
    }

    private Map<Integer, List<Integer>> createGraph(int[][] edges) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int i = 0; i < edges.length; i++) {
            List<Integer> list = graph.getOrDefault(edges[i][0], new ArrayList<>()); // Adjecency list representation.
            list.add(edges[i][1]);
            graph.put(edges[i][0], list);

            list = graph.getOrDefault(edges[i][1], new ArrayList<>()); // Adjecency list representation.
            list.add(edges[i][0]);
            graph.put(edges[i][1], list);
        }

        return graph;
    }
}
