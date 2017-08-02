package cache;

public class Node<T> {

	T data;
	Node next;
	Node prev;
	
	public Node(T data){
		this.data = data;
	}
	
	public String toString(){
		String dataString = data == null ? "null" : data.toString();
		return "Data: " + dataString;
	}
}
