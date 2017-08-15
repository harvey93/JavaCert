package trees;

public class TreeOps {
	
	public static void preOrderTraversal(Node<Integer> node){
		if(node != null){
			System.out.println(node);
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
	}

}
