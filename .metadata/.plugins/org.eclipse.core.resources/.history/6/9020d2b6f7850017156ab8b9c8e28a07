package ch4;

public class BST{
	Node root;
	
	public void insert(Integer data){
		Node node = new Node(data);
		if(root == null){
			root = node;
		}else {
			Node current = root;
			while(current != null){
				if(node.data < current.data){
					if(current.left != null){
						current = current.left;
					}else {
						current.left = node;
						break;
					}
				}else {
					if(current.right != null){
						current = current.right;
					}else {
						current.right = node;
						break;
					}
				}
				
			}
		}
	}
	
	 
	
	private class Node{
		Integer data;
		Node left;
		Node right;
		
		public Node(Integer data){
			this.data = data;
		}
	}
	
	

}
