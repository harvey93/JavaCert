package ch3;

public class NodeStack<T> {

	private Node<T> head;
	private int size;
	private Node<T> current;
	private Node<T> popCurrent;
	
	public NodeStack(){
		this.head = null;
		this.current = null;
		this.popCurrent = null;
		this.size = 0;
	}
	
	public void push(T el){
		Node<T> newNode = new Node<>(el);
		
		if(getSize() == 0){
			this.head = newNode;
			this.current = newNode;
		}
	}
	
	public int getSize(){
		return this.size;
	}
}
