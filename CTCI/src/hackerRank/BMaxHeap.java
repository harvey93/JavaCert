package hackerRank;

import java.util.*;

public class BMaxHeap {
	ArrayList<Integer> store;
	public BMaxHeap(){
		this.store = new ArrayList<>();
	}
	public boolean less(int i, int j){
		return this.store.get(i) < this.store.get(j);
	}
}
