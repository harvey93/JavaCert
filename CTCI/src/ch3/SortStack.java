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
		fillStacks(el);
		this.store.push(el);
		dumpToStore();
	}
	
	public Integer pop(){
		return 5;
	}
	
	private void dumpToStore(){
		while(!this.tempStack.isEmpty()){
			this.store.push(this.tempStack.pop());
		}
	}
	
	private void fillStacks(Integer el){
		while(!isEmpty()){
			if(this.store.peek() < el){
				this.tempStack.push(this.store.pop());
			}
		}
	}
	
	public boolean isEmpty(){
		return this.store.isEmpty();
	}
	
}
