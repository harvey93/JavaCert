package ch3;

import javax.swing.Popup;

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
	
	public Node<T> pop(){
		Node<T> res = this.current;
		return res;
	}
	
	public void push(T el){
		Node<T> newNode = new Node<T>(el);
		
		if(getSize() == 0){
			this.head = newNode;	
		}else if(getSize() == 1){
			this.head.setNext(newNode);
			this.current.setNext(newNode);
		}else {
			this.current.setNext(newNode);		
		}
		
		this.popCurrent = current;
		this.current = newNode;
		
		this.size++;
	}
	
	public int getSize(){
		return this.size;
	}
	
	public String toString(){
		String result = "{";
		Node<T> current = this.head;
		
		while(current != null){
			result += " " + current.getData();
			current = current.getNext();
		}
		
		result += " }";
		
		return result;
	}
}
