package aAProbs;

public class sumNums {
	
	public static int sumRec(int num) {
		if(num == 0) {
			return 0;
		}
		return num + sumRec(num - 1);
	}
	
	public static int sumIt(int num) {
		int sum = 0;
		for(int i = num; i > 0; i--) {
			sum += i;
		}
		return sum;
	}
}
