package ch2;
import java.util.*;

public class RemoveDups {
	
	public static void removeDups(LinkedList<Integer> list){
		HashMap<Integer, Integer> map = hashCount(list);
		list.forEach(el -> {
			if(map.get(el) > 1){
				
			}
		});
		
	}
	
	public static HashMap<Integer, Integer> hashCount(LinkedList<Integer> list){
		HashMap<Integer, Integer> map = new HashMap<>();
		list.forEach(el -> {
			if(map.containsKey(el)){
				int currentCount = map.get(el);
				map.put(el, ++currentCount);
			}else{
				map.put(el,	1);
			}
		});
		return map;
	}
}
