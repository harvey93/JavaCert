package sectionTests;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		DataTypes dTTest = new DataTypes();
//		dTTest.defaultArrays();
		Integer arr[] = {1,2,3,4};
		Integer arr2[] = {1,2,3,4};
		System.out.println(Arrays.deepEquals(arr, arr2));
	}
}
