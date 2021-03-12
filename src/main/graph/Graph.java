package main.graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {

    private final HashMap<Integer, ArrayList<Integer>> graph;

    public Graph () {
        this.graph = new HashMap<>();
    }

    public HashMap<Integer, ArrayList<Integer>> getGraph() {
        return this.graph;
    }

    private void addVertex(int node) {
        this.graph.put(node, new ArrayList<>());
    }

    public void addEdge(int src, int dest) {

        // Graph will be bidirectional by default.
        if (!this.graph.containsKey(src)) {
            this.addVertex(src);
        }

        this.graph.get(src).add(dest);

        if (!this.graph.containsKey(dest)) {
            this.addVertex(dest);
        }

        this.graph.get(dest).add(src);
    }

    public Integer getVertex() {
        return this.graph.keySet().size();
    }

    public String printGraph() {
        StringBuilder str = new StringBuilder();
        this.graph.keySet().forEach(key -> {
            if (this.graph.containsKey(key)) {
                str.append("Key: ").append(key).append(" => ");
                ArrayList<Integer> values = this.graph.get(key);
                values.forEach(value -> {
                    str.append(value).append(" ");
                });
                str.append("\n\n");
            }
        });
        return str.toString();
    }
}
