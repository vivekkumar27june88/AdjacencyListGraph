package com.dvk;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
	
	private LinkedList<Integer> _adjacencyList[];
	private int _v = 0;
	
	/* Creating a graph for v number of vertices */
	@SuppressWarnings("unchecked")
	Graph(int v) {
		this._v = v;
		this._adjacencyList = new LinkedList[v];
		
		for(int i = 0; i < v; i++) {
			this._adjacencyList[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int src, int dest) {
		this._adjacencyList[src].addFirst(dest);
		this._adjacencyList[dest].addFirst(src);
	}
	
	public void printGraph() {
		for(int r = 0; r < this._v; r++) {
			System.out.print("[" + r + "] => ");
			for(Integer c : this._adjacencyList[r]) {
				System.out.print(c + "  ");
			}
			System.out.println("\n");
		}
	}
	
	public void bfs(int sourceVertex) {
		boolean visited[] = new boolean[this._v];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		visited[sourceVertex] = true;
		queue.add(sourceVertex);
		
		while(queue.size() != 0) {
			int currentVertex = queue.poll();
			System.out.println(currentVertex + " ");
			
			Iterator<Integer> it = this._adjacencyList[currentVertex].iterator();
			while(it.hasNext()) {
				int n = it.next();
				if(!visited[n]) {
					queue.add(n);
					visited[n] = true;
				}
			}
		}
	}
	
}
