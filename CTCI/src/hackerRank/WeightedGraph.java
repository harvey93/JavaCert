package hackerRank;
import java.util.*;

public class WeightedGraph {
	
	private class Node{
		private String id;
		private LinkedList<Node> children = new LinkedList<Node>();
		private Node(String id){
			this.id = id;
		}
	}
}
