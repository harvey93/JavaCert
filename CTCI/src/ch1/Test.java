package ch1;

import java.util.*;

public class Test {
	
	public static void main(String[] args) {
		Integer[][] arr = {
				{1,0,3,4},
				{5,6,0,8},
				{9,10,11,0}
		};
		
		for(Integer[] el : arr){
			ArrayList<Integer> list = new ArrayList<>(Arrays.asList(el));
			System.out.println(list);
		}
	}
	
}

