package hackerRank;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapProbs {

	public void ransomNoteSet(String[] ransom, String[] magazine){
		boolean res = true;
		HashSet<String> set = new HashSet<>();
		for(String key : magazine){
			set.add(key);
		}
		for(String key : ransom){
			if(!set.contains(key)){
				res = false;
				break;
			}
		}
		if(res == true){
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
	
	public void ransomNoteMap(String[] ransom, String[] magazine){
		boolean res = true;
		HashMap<String, Integer> map1 = new HashMap<>();
		HashMap<String, Integer> map2 = new HashMap<>();
		
		
		if(res == true){
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
	
	public void fillMap(String str, HashMap<String, Integer> map){
//		for(int i = 0; i < str.length(); i++){
//			String currentChar = str.charAt(i);
//			if(map.containsKey(currentChar)){
//				Integer currentCount = map.get(currentChar);
//				map.put(currentChar, ++currentCount);
//			}else{
//				map.put(currentChar, 1);
//			}
//		}
	}
}
