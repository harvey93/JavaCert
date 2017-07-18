package ch3;


public class ArrStack<T> {
	
	private T[] store;
	private int i;
	
	
	public ArrStack(){
//		this.store = new T[10];
	}
	
	public void push(T el){
		store[i] = el;
		i++;
	}
	
	public T pop(){
		T result = this.store[size() - 1];
		this.store[size() - 1] = null;
		i--;
		return result;
	}
	
	public int size(){
		return this.store.length;
	}
	
	public String toString(){
		return this.store.toString();
	}
	

}
