package aAProbs;
import java.util.*;

public class MostCommonLetter {
	public static Character max;
	
	public static HashMap<Character, Integer> mostCommon(String str){
		HashMap<Character, Integer> result = new HashMap<Character, Integer>();
		HashMap<Character, Integer> counter = new HashMap<Character, Integer>();
		for(int i = 0; i < str.length(); i++) {
			char current = str.charAt(i);
			if(counter.containsKey(current)) {
				Integer currentCount = counter.get(current);
				counter.put(current, ++currentCount);
			}else {
				counter.put(current, 1);
			}
		}
		getMaxChar(counter);
		
		return counter;
	}
	
	public static Character getMaxChar(HashMap<Character, Integer> map) {
		map.forEach((key, val) -> {
			if(max == null || val > map.get(max)){
				max = key;
			}
		});
		return max;
	}
	
}
