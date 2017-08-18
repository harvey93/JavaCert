package ch4;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		Node<Integer> node1 = new Node<>(1);
		Node<Integer> node2 = new Node<>(2);
		Node<Integer> node3 = new Node<>(3);
		Node<Integer> node4 = new Node<>(4);
		Node<Integer> node5 = new Node<>(5);
		Node<Integer> node6 = new Node<>(6);
		Node<Integer> node7 = new Node<>(7);
		
		node1.left = node2;
		node1.right = node3;
		
		node2.left = node4;
		node2.right = node5;
		
		node3.left = node6;
		node3.right = node7;
		
		System.out.println(checkBalanced(node1));
	}
	
	public static boolean checkBalanced2(Node<Integer> node){
		
	}
	
	public static int getHeight(Node<Integer> node){
		if(node == null){
			return -1;
		}else {
			return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
		}
		
	}
	
	public static boolean checkBalanced(Node<Integer> node){
		if(node == null){
			return true;
		}
		int heightDiff = getHeight(node.left) - getHeight(node.right);
		if(heightDiff > 1){
			return false;
		}
		
		return checkBalanced(node.left) && checkBalanced(node.right);
	}
	
	public static ArrayList<LinkedList<Node<Integer>>> depthListBFS(Node<Integer> node){
		ArrayList<LinkedList<Node<Integer>>> lists = new ArrayList<>();
		LinkedList<Node<Integer>> currentList = new LinkedList<>();
		currentList.add(node);
		while(currentList.size() > 0){
			lists.add(currentList);
			LinkedList<Node<Integer>> parents = currentList;
			currentList = new LinkedList<Node<Integer>>();
			for(Node<Integer> parent: parents){
				if(parent.left != null){
					currentList.add(parent.left);
				}
				if(parent.right != null){
					currentList.add(parent.right);
				}
			}
		}
		
		return lists;

	}
	
	public static ArrayList<LinkedList<Node<Integer>>> depthListDFS(Node<Integer> node){
		ArrayList<LinkedList<Node<Integer>>> lists = new ArrayList<>();
		depthListDFS(node, lists, 0);
		return lists;
	}
	
	public static void depthListDFS(Node<Integer> node, 
		ArrayList<LinkedList<Node<Integer>>> lists, int level){
		LinkedList<Node<Integer>> list = null;
		
		if(node == null){
			return;
		}
		
		if(level < lists.size()){
			list = lists.get(level);
		}else {
			list = new LinkedList<>();
			lists.add(list);
		}
		
		list.add(node);
		depthListDFS(node.left, lists, level + 1);
		depthListDFS(node.right, lists, level + 1);
	
		
		
	}
	
	public static Node<Integer> buildBST(int [] arr){
		return buildBST(arr, 0, arr.length - 1);
	}
	
	public static Node<Integer> buildBST(int[] arr, int start, int end){
		if(end < start){
			return null;
		}
		
		int mid = (end + start) / 2;
		
		Node<Integer> node = new Node(arr[mid]);
		node.left = buildBST(arr, 0, mid - 1);
		node.right = buildBST(arr, mid + 1, end);
		return node;
	
		
	}
	
	public static boolean BFS(String label1, String label2, Graph graph){
		boolean res = false;
		LinkedList<GNode> queue = new LinkedList<>();
		HashSet<GNode> visited = new HashSet<>();
		
		GNode destNode = graph.getNode(label2);
		
		queue.add(graph.getNode(label1));
		
		while(!queue.isEmpty()){
			GNode currentNode = queue.removeFirst();
			if(currentNode.data == destNode.data){
				res = true;
				break;
			}
			HashSet<Edge> edges = currentNode.outEdges;
			
			for(Edge e : edges){
				GNode currentConnection = graph.getNode(e.destLabel);
				queue.addLast(currentConnection);
			}
		}
		
		return res;
	}
}
