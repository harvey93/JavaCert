package aAProbs;

public class Palindrome {
	public static boolean isPalindrome(String str){
		if(str.equals(StringReverse.reverse(str))){
			return true;
		}else {
			return false;
		}
	}
}
