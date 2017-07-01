package ch1;

public class OneAway {

	public static boolean isOneAway(String str1, String str2){
		boolean res;
		if(str1.length() == str2.length()){
			res = replace(str1, str2);
		}else {
			if(str1.length() > str2.length()){
				res = insertRemove(str1, str2);
			}else {
				res = insertRemove(str2, str1);
			}
		}
		return res;
	}
	
	public static boolean insertRemove(String longer, String shorter){
		boolean res = true;
		int longI = 0;
		int shortI = 0;
		int wrongCount = 0;
		while(longI < longer.length()){
			if(longer.charAt(longI) == shorter.charAt(shortI)){
				longI++;
				shortI++;
			}else {
				longI++;
				wrongCount++;
			}
			
			if(wrongCount > 1){
				res = false;
				break;
			}
		}
		
		return res;
	}
	
	public static boolean replace(String str1, String str2){
		boolean res = true;
		int i = 0;
		int j = 0;
		int wrongCount = 0;
		while(i < str1.length()){
			if(str1.charAt(i) != str2.charAt(j)){
				wrongCount++;
			}
			if(wrongCount > 1){
				res = false;
				break;
			}
			i++;
			j++;
		}
		
		return res;
	}
}
