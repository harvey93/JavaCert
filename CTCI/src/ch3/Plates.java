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
		if (this.store.get(this.currentStack()).size() == this.maxPlates) {
			addPlate();
		}
	}
	
	public void addPlate(){
		this.store.add(new Stack<T>());
	}
	
	private int currentStack(){
		return this.store.size() - 1;
	}
	
	
	public int size(){
		int result =  this.store.get(this.currentStack()).size();
		if (currentStack() != 0) {
			result += this.maxPlates * (currentStack() - 1);
		}
		return result;
	}
	
	

}
