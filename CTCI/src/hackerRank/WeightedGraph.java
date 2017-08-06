package hackerRank;
import java.util.*;

public class WeightedGraph {
	private HashMap<String, Node> nodeMap = new HashMap<>();
	
	
	private class Node{
		private String id;
		private HashMap<String, Edge> edges = new HashMap<>();
		private Node(String id){
			this.id = id;
		}
		public String toString(){
			return id;
		}
	}
	
	private class Edge{
		private String id;
		private int size;
		private Edge(String id, int size){
			this.id = id;
			this.size = size;
		}
		public String toString(){
			return "Id: " + id + " Size: " + size;
		}

	}
	
	public void addEdge(String id1, String id2, int size){		
		if(nodeMap.containsKey(id2) && nodeMap.containsKey(id2)){
			Node node1 = nodeMap.get(id1);
			Edge edge = new Edge(id2, size);
			node1.edges.put(id2, edge);
		}
		
	}
	
	
	public void addNode(String id){
		Node node = new Node(id);
		nodeMap.put(id, node);
	}
	
	public void nodeList(){
		System.out.println(nodeMap.toString());
	}
	
	public void edgeList(String id){
		if(nodeMap.containsKey(id)){
			Node node = nodeMap.get(id);
			System.out.println(node.edges);
		}
	}
	
	
}
