package hackerRank;

import java.util.*;

public class Test {
	
	
	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.addNode(1);
		graph.addNode(2);
		graph.addNode(3);
		graph.addNode(4);
		graph.addNode(5);
		
		graph.addEdge(1, 3);
		graph.addEdge(3, 4);
		graph.addEdge(4, 2);
		System.out.println(graph.hasPathDFS(1, 2));
	}
	
}


enum Speed{
	FAST(2),
	FASTER(3),
	SLOW(1);
	
	public final int speed;
	
	Speed(int code){
		this.speed = code;
	}
} 

