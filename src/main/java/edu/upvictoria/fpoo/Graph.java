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

}