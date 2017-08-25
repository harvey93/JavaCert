package ch8;

public class Staircase {
	
	public static int tripleStep(int n){
		if(n == 1){
			return 1;
		}
		if(n == 2){
			return 2;
		}
		if(n == 3){
			return 4;
		}
		
		return tripleStep(n - 1) + tripleStep(n - 2) + tripleStep(n - 3);
	}

}

