package aAProbs;
import java.util.*;

public class Palindrome {
	public static boolean isPalindrome(String str){
		if(str.equals(StringReverse.reverseIP(str))){
			return true;
		}else {
			return false;
		}
	}
	
	public static String longestPalindrome(String str) {
		ArrayList<String> arr = new ArrayList<>();
		for(int i = 0; i < str.length(); i++) {
			for(int j = i; j < str.length(); j++){
				arr.add(str.substring(i, j + 1));
			}
		}
		String maxPal = null;;
		for(String el : arr) {
			if(isPalindrome(el)){
				if(maxPal == null || el.length() > maxPal.length()){
					maxPal = el;
				}
			}
		}
		
		return maxPal;
	}
}
