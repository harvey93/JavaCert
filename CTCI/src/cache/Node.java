package cache;

public class Node<T> {

	T data;
	T next;
	T prev;
	
	public Node(T data){
		this.data = data;
	}
}
