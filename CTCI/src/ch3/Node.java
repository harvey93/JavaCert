package ch3;

public class Node<T> {
	
	private T data;
	private T next;
	
	public Node(T el){
		this.data = el;
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public T getNext() {
		return next;
	}

	public void setNext(T next) {
		this.next = next;
	}
	
	
}