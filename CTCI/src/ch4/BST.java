package ch4;

public class BST<T>{
	Node<T> root;
	
	public void insert(T data){
		Node<T> node = new Node<>(data);
		if(root == null){
			root = node;
		}else {
			
		}
	}
	
	 
	
	private class Node<T>{
		T data;
		Node<T> left;
		Node<T> right;
		
		public Node(T data){
			this.data = data;
		}
	}
	
	

}
