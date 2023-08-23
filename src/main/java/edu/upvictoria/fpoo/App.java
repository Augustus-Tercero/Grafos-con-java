package edu.upvictoria.fpoo;

public class App
{
    public static void main(String[] args) {
        // Crear una instancia de DirectedGraph
        var directedGraph = new Graph.DirectedGraph();

        // Crear una instancia de UndirectedGraph
        var undirectedGraph = new Graph.UndirectedGraph();

        // Ahora puedes usar estas instancias para trabajar con los grafos dirigidos y no dirigidos.

        // Ejemplo de cómo agregar vértices y aristas a un grafo dirigido:
        directedGraph.addVertex(1);
        directedGraph.addVertex(2);
        directedGraph.addVertex(3);
        directedGraph.addEdge(1, 2);
        directedGraph.addEdge(2, 3);

        // Ejemplo de cómo agregar vértices y aristas a un grafo no dirigido:
        undirectedGraph.addVertex(1);
        undirectedGraph.addVertex(2);
        undirectedGraph.addVertex(3);
        undirectedGraph.addEdge(1, 2);
        directedGraph.addEdge(2, 3);

        System.out.println("dirigido:");
        directedGraph.printGraph();
        System.out.println("no dirigido:");
        undirectedGraph.printGraph();
    }
}
