package edu.upvictoria.fpoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class UndirectedGraph<T> extends Graph<T> implements GraphUtils<T>{
    public UndirectedGraph() {
        super();
    }

    @Override
    public void addVertex(T vertex) {
        if (!hasVertex(vertex)) {
            vertices.put(vertex, new ArrayList<>());
        }
    }

    @Override
    public void addEdge(T sourceVertex, T destinationVertex) {
        if (hasVertex(sourceVertex) && hasVertex(destinationVertex)) {
            vertices.get(sourceVertex).add(destinationVertex);
            vertices.get(destinationVertex).add(sourceVertex); // Since it's an undirected graph
        }
    }

    @Override
    public void printGraph() {
        for (Map.Entry<T, List<T>> entry : vertices.entrySet()) {
            T vertex = entry.getKey();
            List<T> neighbors = entry.getValue();
            System.out.print(vertex + " -> ");
            for (T neighbor : neighbors) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}
