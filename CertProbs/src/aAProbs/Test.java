package aAProbs;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
	
	public static void main(String args[]) {
		Integer [] arr = {5,3,10,12,0,15};
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println(ThirdGreatest.getThird(list));
	}

}
