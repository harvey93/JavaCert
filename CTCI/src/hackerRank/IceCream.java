package hackerRank;

import java.util.HashSet;

public class IceCream {

	public static void flavors(int m, int[] a){
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0; i < a.length; i++){
			int current = a[i];
			int target = m - current;
			if(set.contains(target)){
				break;
			}
		}
	}
}
