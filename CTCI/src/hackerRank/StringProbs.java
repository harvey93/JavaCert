package hackerRank;

import java.awt.Checkbox;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class StringProbs {

	public int numbersNeeded(String first, String second){
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		fillMap(first, map1);
		fillMap(second, map2);
		int count = checkMap(map1, map2);
		count += checkMap(map2, map1);
		return count;
	}
	
	public int checkMap(HashMap<Character, Integer> map1, HashMap<Character, Integer> map2){
		int count = 0;
		for(Character key : map1.keySet()){
			Integer map1Count = map1.get(key);
			if(map2.containsKey(key)){
				Integer map2Count = map2.get(key);
				count += Math.abs(map1Count - map2Count);
				map1.put(key, 0);
				map2.put(key, 0);

			}else {
				count += map1Count;
			}
			
		}
		return count;
	}
	
	public void fillMap(String str, HashMap<Character, Integer> map){
		for(int i = 0; i < str.length(); i++){
			Character currentChar = str.charAt(i);
			if(map.containsKey(currentChar)){
				Integer currentCount = map.get(currentChar);
				map.put(currentChar, ++currentCount);
			}else{
				map.put(currentChar, 1);
			}
		}
	}
}
