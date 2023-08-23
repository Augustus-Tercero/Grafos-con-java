package edu.upvictoria.fpoo;

import java.util.ArrayList;
import java.util.List;

public class DirectedGraph<T> extends Graph<T> {

    public DirectedGraph() {
        super();
    }

    @Override
    public void addVertex(T vertex) {
        if (!vertices.containsKey(vertex)) {
            vertices.put(vertex, new ArrayList<>());
        }
    }

    @Override
    public void addEdge(T sourceVertex, T destinationVertex) {
        if (vertices.containsKey(sourceVertex) && vertices.containsKey(destinationVertex)) {
            vertices.get(sourceVertex).add(destinationVertex);
        }
    }

    public boolean hasEdge(T source, T destination) {
        List<T> neighbors = vertices.get(source);
        return neighbors != null && neighbors.contains(destination);
    }

    @Override
    public void printGraph() {
        for (T vertex : vertices.keySet()) {
            List<T> neighbors = vertices.get(vertex);
            if (neighbors != null) {
                System.out.print(vertex + " -> ");
                for (T neighbor : neighbors) {
                    System.out.print(neighbor + " ");
                }
                System.out.println();
            }
        }
    }
}
