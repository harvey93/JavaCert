package aAProbs;
import java.util.*;

public class RepeatedLetters {

	public static int numRep(String str){
		HashMap<Character, Integer> map = new HashMap<>();
		int resCount = 0;
		for(int i = 0; i < str.length(); i++) {
			char current = str.charAt(i);
			if(map.containsKey(current)){
				int currentCount = map.get(current);
				map.put(current, ++currentCount);
			}else {
				map.put(current, 1);
			}
		}
		for(Character key : map.keySet()){
			if(map.get(key) > 1){
				resCount++;
			}
		}
		
		return resCount;
	}
}
