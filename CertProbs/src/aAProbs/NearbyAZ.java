package aAProbs;

public class NearbyAZ {
	
	public static boolean nearby(String str){
		boolean retVal = false;
		outerLoop:
		for(int i = 0; i < str.length() - 3; i++) {
			System.out.println(i);
			if(str.charAt(i) == 'a'){
				for(int j = i + 1; j < i + 4; j++){
					if(str.charAt(j) == 'z'){
						retVal = true;
						break outerLoop;
					}
				}
			}
		}
		return retVal;
	} 
}
