package cache;

import java.util.Arrays;

public class IntSet {

	Integer[][] store;
	
	public IntSet(int size){
		this.store = new Integer [size][size];
	}
	
	public void insert(int val){
		
	}
	
	public Integer delete(int val){
		return 5;
	}
	
	public boolean contains(int val){
		return true;
	}
	
	
	
	public String toString(){
		String str = "[";
		for(Integer[] arr : store){
			str += Arrays.toString(arr);
		}
		str += "]";
		return str;
		
	}
}
