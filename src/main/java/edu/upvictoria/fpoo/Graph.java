package edu.upvictoria.fpoo;

import java.util.*;

public abstract class Graph<T> implements GraphUtils<T> {
    protected Map<T, List<T>> vertices;

    public Graph() {
        this.vertices = new HashMap<>();
    }

    public Map<T, List<T>> getVertices() {
        return vertices;
    }

    public void setVertices(Map<T, List<T>> vertices) {
        this.vertices = vertices;
    }

    public List<T> getAdjacentVertices(T vertex) {
        return vertices.get(vertex);
    }

    public boolean hasVertex(T vertex) {
        return vertices.containsKey(vertex);
    }


    public static class DirectedGraph<T> extends Graph<T> {

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


    static class UndirectedGraph<T> extends Graph<T> {
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
}