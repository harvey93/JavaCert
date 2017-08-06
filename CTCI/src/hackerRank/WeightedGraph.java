package hackerRank;
import java.util.*;

public class WeightedGraph {
	private HashMap<String, Node> nodeMap = new HashMap<>();
	
	public ArrayList<Node> topoSort(){
		ArrayList<Node> nodes = new ArrayList<>();
		HashMap<String, Node> mapCopy = (HashMap<String, Node>) nodeMap.clone();
		
		while(!mapCopy.isEmpty()){
			for(String key : mapCopy.keySet()){
				Node current = mapCopy.get(key);
				if(current.inEdges.isEmpty()){
					nodes.add(current);
					clearOutEdges(current);
				}
			}
		}
		return nodes;
	}
	
	public void clearOutEdges(Node node){
		
	}
	
	
	private class Node{
		private String id;
		private HashMap<String, Edge> inEdges = new HashMap<>();
		private HashMap<String, Edge> outEdges = new HashMap<>();
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
			return "Size: " + size;
		}

	}
	
	public void addEdge(String id1, String id2, int size){		
		if(nodeMap.containsKey(id2) && nodeMap.containsKey(id2)){
			Node node1 = nodeMap.get(id1);
			Node node2 = nodeMap.get(id2);
			
			Edge outEdge = new Edge(id2, size);
			node1.outEdges.put(id2, outEdge);
			
			Edge inEdge = new Edge(id1, size);
			node2.inEdges.put(id1, inEdge);
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
			System.out.println("In Edges: " + node.inEdges);
			System.out.println("Out Edges: " + node.outEdges);
		}
	}
	
	
}
