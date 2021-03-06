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
	
	public static boolean powerOfTwoRec(int num){
		if(num == 1){
			return true;
		}
		
		if(num % 2 == 0){
			return powerOfTwoRec(num / 2);
		}else {
			return false;		
		}
	}
}
