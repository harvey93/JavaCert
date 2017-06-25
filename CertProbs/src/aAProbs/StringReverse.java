package aAProbs;

public class StringReverse {
	
	public static String reverse(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i = str.length() - 1; i >= 0; i--){
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	
	public static String reverseIP(String str) {
		return reverseIP(str, 0, str.length() - 1);
	}
	
	public static String reverseIP(String str, int i, int j){
		if(i ==  j) {
			return str;
		}
		return Character.toString(str.charAt(i));
	
	}

}
