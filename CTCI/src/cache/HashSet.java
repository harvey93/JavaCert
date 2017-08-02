package cache;

import java.util.*;

public class HashSet<T> {
	private ArrayList<ArrayList<T>> store;
	private int size;
	private int currentSize = 0;
	
	public HashSet(int size){
		this.store = new ArrayList<ArrayList<T>>();
		this.size = size;
	}
	
	public void insert(T val){
		ArrayList<T> bucket = getBucket(val);
		if(currentSize == size){
			resize();
		}
		
	}
	
	private void resize(){
		
	}
	
	private void fillBucket(ArrayList<T> bucket, T val){
		bucket.add(val);
		currentSize++;
	}

	private ArrayList<T> getBucket(T val){
		int bucket = hash(val) % size;
		return store.get(bucket);
	}

	private int hash(T el){
		return el.hashCode();
	}
	
	public String toString(){
		return store.toString();
	}
}
