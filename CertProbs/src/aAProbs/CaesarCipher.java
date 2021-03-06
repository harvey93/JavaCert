package aAProbs;

public class CaesarCipher {

	public static String cipher(String str, int offset) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i++){
			int currentOrd = (int) str.charAt(i);
			if(currentOrd > 96 && currentOrd + offset < 123){
				int newOrd = currentOrd + offset;
				char currentChar = (char) newOrd;
				sb.append(currentChar);
			} else if (currentOrd > 96 && currentOrd + offset >= 123){
				int newOrd = currentOrd + offset - 26;
				char currentChar = (char) newOrd;
				sb.append(currentChar);
			}else {
				sb.append(str.charAt(i));
			}
			
		}
		
		return sb.toString();
	}
}
