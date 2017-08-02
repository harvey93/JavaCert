package cache;

public class LinkedList<T>{

	private Node<T> head = new Node<T>(null);;
	private Node<T> tail = new Node<T>(null);;
	
	public LinkedList(){
		head.next = tail;
		tail.prev = head;
	}
	
	public boolean isEmpty(){
		boolean res = false;
		if(head.next == null){
			res = true;
		}
		return res;
	}
}
