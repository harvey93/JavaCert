package aAProbs;

public class LongestWord {
	
	public static String longest(String str) {
		String [] res = str.split(" ");
		String maxWord = "";
		for(int i = 0; i < res.length; i++) {
			if(res[i].length() > maxWord.length()) {
				maxWord = res[i];
			}
		}
		return maxWord;
	}
}
