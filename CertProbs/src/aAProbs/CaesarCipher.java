package aAProbs;

public class CaesarCipher {

	public static String cipher(String str, int offset) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i++){
			int currentOrd = (int) str.charAt(i);
			if(currentOrd > 96 && currentOrd < 123){
				int newOrd = currentOrd + offset;
				char newChar = (char) newOrd;
				sb.append(newChar);
			}
//			System.out.println(currentOrd);
		}
		return sb.toString();
	}
}
