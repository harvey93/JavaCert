package cache;

public class LRUCache<Key, Value> {

	private int size;
	
	public LRUCache(int size){
		this.size = size;
		LinkedList<Key, Value> list = new LinkedList<>();
		HashMap<Key, Node<Key, Value>> map = new HashMap<>();
	}
	
	public void add(Key key, Value value){
		
	}
}
