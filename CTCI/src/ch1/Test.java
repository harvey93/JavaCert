package ch1;

import java.util.*;

public class Test {
	
	public static void main(String[] args) {
		Integer[][] arr = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
				};
		arr = Matrix.transpose(arr);
		for(int i = 0; i < arr.length; i++){
			ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr[i])); 
			System.out.println(list);
		}
		
//		Integer [] arr2 = {1,2,3,4,4,5};
////		Matrix.reverse(arr2);
////		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr2));
////		System.out.println(list2);
	}
}

//{
//	{7,4,1},
//	{8,5,2},
//	{9,6,3}
//}
//	