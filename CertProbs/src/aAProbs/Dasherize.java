package aAProbs;

public class Dasherize {
	
	public static StringBuilder dashNum(int num) {
		StringBuilder sb = new StringBuilder();
		String str = Integer.toString(num);
		for(int i = 0; i < str.length(); i++){
			int current = Integer.parseInt(Character.toString(str.charAt(i)));
			if(current % 2 == 1){
				if(i == 0){
					sb.append(str.charAt(i));
					sb.append("-");					
					
				}else if (i == str.length() - 1){
					sb.append("-");
					sb.append(str.charAt(i));
				}else {
					sb.append("-");
					sb.append(str.charAt(i));
					sb.append("-");					
				}
			} else {
				sb.append(str.charAt(i));
			}
		}
		return sb;
	}
}
