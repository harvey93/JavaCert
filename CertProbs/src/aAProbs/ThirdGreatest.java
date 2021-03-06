package aAProbs;
import java.util.*;

public class ThirdGreatest {
	
	public static Integer getThird(ArrayList<Integer> arr){
		Integer first = null;
		Integer second = null;
		Integer third = null;
		for(int i = 0; i < arr.size(); i++) {
			int current = arr.get(i);
			if(first == null || current > first){
				third = second;
				second = first;
				first = current;
			}else if(second == null || current > second) {
				third = second;
				second = current;
			} else if (third == null || current > third) {
				third = current;
			}
		}

		return third;
	}
	
}
