package aAProbs;

public class ScrambleString {
	
	public static String scramble(String str, int [] arr){
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < arr.length; i ++) {
			sb.append(str.charAt(arr[i]));
		}
		return sb.toString();
	}
}
