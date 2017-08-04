package cache;

public class LRUCache<Key, Value> {

	private int size;
	private int currentSize;
	
	public LRUCache(int size){
		this.size = size;
		LinkedList<Key, Value> list = new LinkedList<>();
		HashMap<Key, Node<Key, Value>> map = new HashMap<>();
	}
	
	public void set(Key key, Value value){
		if(currentSize < size){
			add(key, value);
			currentSize++;
		}else{
			update(key, value)
		}
	}
	
	private void add(Key key, Value value){
		
	}
	
	private void update(Key key, Value value){
		
	}
}
