package aAProbs;

public class GreatestCommonFactor {
	
	public static int gcf(int num1, int num2) {
		int res = 1;
		int smaller;
		if(num1 < num2){
			smaller = num1;
		}else {
			smaller = num2;
		}
		for(int i = smaller; i > 0; i--){
			if((num1 % i == 0) && (num2 % i == 0)){
				res = i;
				break;
			}
		}
		return res;
	}
}
