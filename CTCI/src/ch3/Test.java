package ch3;

import java.util.Arrays;

public class Test {

	
	public static void main(String[] args){
		String string = "Hello";
		string.length();
		String [] arr = string.split("");
		System.out.println(String.join("-", arr));
	}
	
}
