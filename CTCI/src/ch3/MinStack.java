package ch3;

import java.util.HashMap;
import java.util.Stack;

public class MinStack{
	private NodeStack<HashMap<Integer, Integer>> stack;
	private Integer min;
	
	public MinStack(){
		 this.stack = new NodeStack<>();
	}
	
	public void push(Integer el){
		if(this.min == null || this.min > el) {
			min = el;
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(el, min);
		this.stack.push(map);
		System.out.println(this.stack);
	}
	
	
	 
}
