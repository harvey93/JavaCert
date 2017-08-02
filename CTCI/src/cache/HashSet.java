package cache;

import java.util.*;

public class HashSet<T> {
	private ArrayList<T> store;
	private int size;
	private int currentSize = 0;
	
	public HashSet(int size){
		this.store = new ArrayList<T>();
		this.size = size;
	}



	private int hashCode(T el){
		return el.hashCode();
	}
}
