package hackerRank;

import java.util.*;

public class Test {
	
	
	public static void main(String[] args) {
//		double []medians = RunningMedian.getMedians(new int []{1,2,3,4,5,6,7,8,9});
//		int [] arr = {10,-5,2,13,4,3,0,-9,4};
		int [] arr = {1,3,5,2,4,6};
//		Sorting.mergeSort2(arr);
//		System.out.println(Arrays.toString(arr));
		Sorting sort = new Sorting();
		int[] sorted = sort.mergeSort(arr);
		System.out.println(Arrays.toString(sorted));
		System.out.println(sort.inversions);
//		int[] arr1 = {1,3};
//		int[] arr2 = {2,4,5,7};
//		System.out.println(Arrays.toString(Sorting.merge(arr1, arr2)));
		
//		System.out.println(Sorting.mergeSort(arr));
	}
	
}




