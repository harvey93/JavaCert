package ch3;

import java.sql.Array;
import java.util.Arrays;

public class ArrStack<T> {
	
	private T[] store;
	private int size;
	
	
	@SuppressWarnings("unchecked")
	public ArrStack(){
		this.store = (T[])new Object[4];
	}
	
	public void push(T el){
		store[size] = el;
		size++;
	}
	
	public T pop() throws StackEmptyException{
		if(size == 0){
			throw new StackEmptyException("Can't perform pop. Stack is empty.");
		}
		size--;
		T result = this.store[size];
		this.store[size] = null;
		return result;
	}
	
	public int getSize(){
		return this.size;
	}
	
	private int capacity(){
		return this.store.length;
	}
	
	public String toString(){
		return Arrays.toString(this.store);
	}
	

}
