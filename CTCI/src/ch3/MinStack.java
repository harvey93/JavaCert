package ch3;

import java.util.HashMap;
import java.util.Stack;

public class MinStack{
	private NodeStack<HashMap<String, Integer>> stack;
	private Integer min;
	
	public MinStack(){
		 this.stack = new NodeStack<>();
	}
	
	public void push(Integer el){
		if(this.min == null || this.min > el) {
			this.min = el;
		}
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Value", el);
		map.put("Min", this.min);
		this.stack.push(map);
	}
	
	public String toString(){
		return this.stack.toString();
	}
	 
}
