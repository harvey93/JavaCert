package ch3;

import java.util.ArrayList;
import java.util.Stack;

public class Plates<T>{
	
	private ArrayList<Stack<T>> store;
	
	private final int maxPlates;
	
	public Plates(int maxPlates){
		this.store = new ArrayList<>();
		this.store.add(new Stack<T>());
		this.maxPlates = maxPlates;
	}
	
	public void push(T el){
		if (currentStack().size() == this.maxPlates) {
			addPlate();
		}
		currentStack().add(el);
	}
	
	public void addPlate(){
		this.store.add(new Stack<T>());
	}
	
	private Stack<T> currentStack(){
		return this.store.get(this.store.size() - 1);
	}
	
	private int currentIndex(){
		return this.store.size() - 1;
	}
	
	public int size(){
		int result =  currentStack().size();
		if (currentIndex() != 0) {
			result += this.maxPlates * currentIndex();
		}
		return result;
	}
	
	public String toString() {
		return this.store.toString();
	}
	

}
