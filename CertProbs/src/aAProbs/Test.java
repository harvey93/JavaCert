package aAProbs;

import java.util.ArrayList;
import java.util.Arrays;



public class Test {
	
	public static void main(String args[]) {
		int [] arr = {1,2,3,4};
//		varArgsTest(1,2,3,4);
		varArgsTest(arr);
	}
	
	public static void varArgsTest(int ... nums){
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}

}
