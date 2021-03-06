package aAProbs;

public class CapitalizeWords {
	
	public static String capWords(String str){
		StringBuilder sb = new StringBuilder();
		String[] arr = str.split(" ");
		for(int i = 0; i < arr.length; i++) {
			sb.append(capWord(arr[i]));
			if(i != arr.length - 1){
				sb.append(" ");
			}
		}
		
		return sb.toString();
	}
	
	public static String capWord(String str){
		String res = "";
		res += Character.toString(str.charAt(0)).toUpperCase();
		res += str.substring(1);
		
		return res;
	}
}
