package edu.upvictoria.fpoo;

public interface GraphUtils<T> {
    void printGraph();
    void addVertex(T vertex);
    void addEdge(T sourceVertex, T destinationVertex);
}
