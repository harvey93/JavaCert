package aAProbs;

public class Vowels {
	public static int countVowels(String str) {
		int counter = 0;
		for(int i = 0; i < str.length(); i++) {
			if(isVowel(str.charAt(i))){
				counter++;
			}
		}
		return counter;
	}
	
	public static boolean isVowel(char chr){
			if((chr == 'a') || (chr == 'e') || (chr == 'i') || (chr == 'o') || (chr == 'u')){
				return true;	
			} else {
				return false;
			}
			
	}
}
