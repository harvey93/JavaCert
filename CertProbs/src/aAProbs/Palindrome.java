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
			for(int j = i + i; j < str.length(); j++){
				
			}
		}
		return str;
	}
}
