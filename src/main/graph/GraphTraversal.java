package main.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphTraversal {

    private void dfsUtil (Graph g, boolean []visited, int index) {

        visited[index] = true;
        System.out.println(index);

        ArrayList<Integer> adjacentNodes = g.getGraph().get(index);
        for (int node : adjacentNodes) {
            if (!visited[node]) {
                visited[node] = true;
                this.dfsUtil(g, visited, node);
            }
        }

    }

    public void bfs (Graph graph, int src) {

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(src);

        int size = graph.getVertex();

        boolean[] visited = new boolean[size];
        visited[src] = true;

        while (!queue.isEmpty()) {
            int node = queue.peek();
            queue.poll();

            System.out.println(node);

            ArrayList<Integer> adjacentNodes = graph.getGraph().get(node);
            for (int nodes : adjacentNodes) {
                if (!visited[nodes]) {
                    visited[nodes] = true;
                    queue.add(nodes);
                }
            }
        }

    }

    public void dfs (Graph graph, int src) {

        int size = graph.getVertex();
        boolean[] visited = new boolean[size];
        visited[src] = true;

        // Recursively visit all the nodes.
        this.dfsUtil(graph, visited, src);

    }

}
