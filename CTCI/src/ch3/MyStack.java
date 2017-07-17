package ch3;


public class MyStack {
	
	private Integer[] store;
	private int index;
	public MyStack(){
		this.store = new Integer[4];
		this.index = 0;
	}
	
	public void pop(Integer el){
		if(this.index == size()){
			resize();
		}
		add(el);
	}
	
	public int size(){
		return this.store.length;
	}
	
	public void add(Integer el){
		this.store[this.index] = el;
		index++;
	}
	
	private void resize(){
		
	}
}
