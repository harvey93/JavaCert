package aAProbs;

public class Power {
	
	public static boolean powerOfTwo(int num){
		boolean retVal = true;
		while(num > 1){
			if(num % 2 != 0){
				retVal = false;
				break;
			}
			num /= 2;
		}
		return retVal;
	}
}
