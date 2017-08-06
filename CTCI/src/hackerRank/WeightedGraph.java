package hackerRank;
import java.util.*;

public class WeightedGraph {
	private HashMap<String, Node> Nodemap = new HashMap<>();
	
	
	private class Node{
		private String id;
		private LinkedList<Node> children = new LinkedList<Node>();
		private Node(String id){
			this.id = id;
		}
		public String toString(){
			return id;
		}
	}
	
	private class Edge{
		private String id;
	}
	
	
	public void addNode(String id){
		Node node = new Node(id);
		Nodemap.put(id, node);
	}
	
	public void nodeList(){
		System.out.println(Nodemap.toString());
	}
	
	
}
