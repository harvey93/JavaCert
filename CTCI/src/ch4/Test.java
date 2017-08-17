package ch4;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		Graph<String> graph = new Graph<>();
		graph.addNode("Y", "Yerevan");
		graph.addNode("L", "London");
		graph.addNode("NY", "New York");
		graph.addNode("LA", "Los Angeles");
		graph.addNode("P", "Paris");
		
		graph.addNode("O", "Oakland");

		graph.addEdge("Y", "L", 5);
		graph.addEdge("Y", "NY", 10);
		graph.addEdge("Y", "LA", 6);
		
		
		graph.addEdge("LA", "P", 6);
		
		System.out.println(BFS("Y", "O", graph));
	}
	
	public static boolean BFS(String label1, String label2, Graph graph){
		boolean res = false;
		LinkedList<String> queue = new LinkedList<>();
		queue.add(label1);
		
		while(!queue.isEmpty()){
			String currentLabel = queue.removeFirst();
			if(currentLabel.equals(label2)){
				res = true;
				break;
			}
			HashSet<Edge> edges = graph.getNodeOutEdges(currentLabel);
			for(Edge e : edges){
				queue.add(e.destLabel);
			}
		}
		
		return res;
	}
}
