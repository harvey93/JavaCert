package hackerRank;

import java.util.*;

public class Test {
	
	
	public static void main(String[] args) {
//		double []medians = RunningMedian.getMedians(new int []{1,2,3,4,5,6,7,8,9});
		int [] arr = {10,-5,2,13,4,3};
		Sorting.mergeSort(arr);
		System.out.println(Arrays.toString(arr));
		int[] arr1 = {1,3,6};
		int[] arr2 = {2,5,9};
		System.out.println(Arrays.toString(Sorting.merge(arr1, arr2)));
		
//		System.out.println(Sorting.mergeSort(arr));
	}
	
}




