package trees;

import java.util.Stack;

public class TreeOps {
	
	public static void postOrderTraversal(Node<Integer> node){
		if(node != null){
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
			System.out.println(node);
		}
	}
	
	public static void preOrderTraversal(Node<Integer> node){
		if(node != null){
			System.out.println(node);
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
	}
	
	public static void InOrderTraversal(Node<Integer> node){
		if(node != null){
			preOrderTraversal(node.left);
			System.out.println(node);
			preOrderTraversal(node.right);
		}

	}
	
	public static void InOrderStack(Node<Integer> node){
		if(node != null){
			preOrderTraversal(node.left);
			System.out.println(node);
			preOrderTraversal(node.right);
		}

	}

	

	
	public static void preOrderStack(Node<Integer> node){
		Stack<Node<Integer>> stack = new Stack<>();
		stack.push(node);
		while(!stack.isEmpty()){
			Node<Integer> current = stack.pop();
			if(current != null){
				System.out.println(current);
				stack.push(current.right);
				stack.push(current.left);
			
			}
		}
	}

}
