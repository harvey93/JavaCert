package hackerRank;
import java.util.*;

public class Davis {

	public static int staircase(int num){
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 2);
		map.put(3, 4);
		return staircase(num, map);
	}
	
	private static int staircase(int num, HashMap<Integer, Integer> map){
		if(num < 1){
			return 0;
		}
		if(map.containsKey(num)){
			return map.get(num);	
		}
		int back1 = staircase( num - 1, map);
		int back2 = staircase( num - 2, map);
		int back3 = staircase( num - 3, map);
		map.put(num - 1, back1);
		map.put(num - 2, back2);
		map.put(num - 3, back3);
		
		return back1 + back2 + back3;
	}
}
