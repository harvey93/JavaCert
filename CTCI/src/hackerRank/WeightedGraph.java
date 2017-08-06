package hackerRank;
import java.util.*;

public class WeightedGraph {
	private HashMap<String, Node> Nodemap = new HashMap<>();
	
	
	private class Node{
		private String id;
		private HashMap<String, Node> edges = new HashMap<>();
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
	}
	
	
	public void addNode(String id){
		Node node = new Node(id);
		Nodemap.put(id, node);
	}
	
	public void nodeList(){
		System.out.println(Nodemap.toString());
	}
	
	
}
