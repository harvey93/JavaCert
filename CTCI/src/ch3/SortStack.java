package ch3;

import java.util.Stack;

public class SortStack{

	Stack<Integer> store;
	Stack<Integer> tempStack;
	
	public SortStack(){
		this.store = new Stack<>();
		this.tempStack = new Stack<>();
	}
	
	public void push(Integer el){
		while(!isEmpty()){
			if(this.store.peek() < el){
				
			}
		}
		
	}
	
	public boolean isEmpty(){
		return this.store.isEmpty();
	}
	
}
