package com.dvk;

public class AdjacencyListGraph {

	public static void main(String[] args) {
		Graph graph = new Graph(5);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		
		graph.printGraph();
		
		graph.bfs(0);
	}

}
