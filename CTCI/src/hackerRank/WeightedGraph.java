package hackerRank;
import java.util.*;

public class WeightedGraph {
	private HashMap<String, Node> map = new HashMap<>();
	
	public WeightedGraph(){
		System.out.println(new Node("hello"));
	}
	
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
	
	public void addNode(String id){
		
	}
	
	
}
