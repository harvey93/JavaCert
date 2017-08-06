package hackerRank;
import java.util.*;

public class WeightedGraph {
	private HashMap<String, Node> nodeMap = new HashMap<>();
	
	public HashMap<Node, Double> shortestPath(String id1, String id2){
		HashMap<Node, Double> nodes = new HashMap<>();
		HashSet<Node> visited = new HashSet<>();
		HashSet<Node> unvisited = new HashSet<>();
		visited.add(nodeMap.get(id1));
		for(String key : nodeMap.keySet()){
			Node node = nodeMap.get(key);
			if(key == id1){
				nodes.put(node, 0.0);
				continue;
			}
			nodes.put(node, Double.POSITIVE_INFINITY);
			unvisited.add(node);
		}
		
		return shortestPath(id2, visited, unvisited, nodes);
	}
	
	public HashMap<Node, Double> shortestPath(String dest, HashSet<Node> visited, HashSet<Node> unvisited, HashMap<Node, Double> path){
//		System.out.println(path);		
		return path;
	}
	
	public ArrayList<Node> topoSort(){
		ArrayList<Node> nodes = new ArrayList<>();
		return topoSort(nodes);
	}
	
	public ArrayList<Node> topoSort(ArrayList<Node> nodes){
		if(nodeMap.isEmpty()){
			return nodes;
		}
		Node node = null;
		for(String key : nodeMap.keySet()){
			Node current = nodeMap.get(key);
			if(current.inEdges.isEmpty()){
				node = current;
				break;
			}
		}
		if(node == null){
			return nodes;
		}
		nodeMap.remove(node.id);
		clearOutEdges(node);
		nodes.add(node);
		return topoSort(nodes);
	}
	
	public void clearOutEdges(Node node){
		HashMap<String, Edge> edges = node.outEdges;
		for(String key : edges.keySet()){
			Node outNode = nodeMap.get(key);
			outNode.inEdges.remove(node.id);
		}
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
