package hackerRank;

import java.util.*;

public class Test {
	
	
	public static void main(String[] args) {
		WeightedGraph graph = new WeightedGraph();
		graph.addNode("A");
		graph.addNode("B");
		graph.addNode("C");
		graph.addNode("D");
		
		graph.addEdge("A", "B", 3);
		graph.addEdge("A", "C", 4);
		graph.addEdge("A", "D", 5);
		
		graph.addEdge("B", "C", 5);
		graph.addEdge("B", "D", 9);
		
		graph.addEdge("D", "A", 1);
		
		graph.edgeList("D");
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

