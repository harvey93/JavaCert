package cache;
import java.util.*;

public class HashMap<Key, Value> {
	
	
	private ArrayList<LinkedList<Key, Value>> store = new ArrayList<>();
	private int capacity;
	private int size;
	
	public HashMap(int capacity){
		this.capacity = capacity;
		fillStore();
	}
	
	private void fillStore(){
		
	}
	
	public HashMap(){
		this(4);
	}
	
	
	
	
	

}
