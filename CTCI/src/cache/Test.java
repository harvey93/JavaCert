package cache;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) throws Exception{
		LRUCache<String, Integer> cache = new LRUCache<>(4);
		cache.set("Hrant", 23);
		cache.set("Varuzhan", 24);
		cache.set("Khacho", 20);
		cache.set("Vazgen", 35);
		cache.set("Anush", 22);
		cache.set("Vazgen", 0);
		System.out.println(cache);
	}

}

