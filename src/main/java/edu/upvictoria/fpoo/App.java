package edu.upvictoria.fpoo;

public class App
{
    public static void main( String[] args ) {
        DirectedGraph<Integer> directedGraph = new DirectedGraph<>();
        directedGraph.addVertex(1);
        directedGraph.addVertex(2);
        directedGraph.addVertex(3);
        directedGraph.addEdge(1, 2);
        directedGraph.addEdge(2, 3);
        System.out.println("Grafo Dirigido:");
        directedGraph.printGraph();

        Graph<Integer> undirectedGraph = new UndirectedGraph<>();
        undirectedGraph.addVertex(1);
        undirectedGraph.addVertex(2);
        undirectedGraph.addVertex(3);
        undirectedGraph.addEdge(1, 2);
        undirectedGraph.addEdge(2, 3);
        System.out.println("Grafo No Dirigido:");
        undirectedGraph.printGraph();

    }
}
