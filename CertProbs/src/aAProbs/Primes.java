package aAProbs;
import java.util.*;

public class Primes {

	public static boolean isPrime(int num){
		double dubNum = (double ) num;
		boolean retVal = true;
		for(int i = 2; i <= Math.sqrt(dubNum); i++){
			if(num % i == 0){
				retVal = false;
				break;
			}
		}
		return retVal;
	}
	
	public static int nthPrime(int num){
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 2; arr.size() < num; i++) {
			if(isPrime(i)){
				arr.add(i);
			}
		}
	
		return arr.get(arr.size() - 1);
	}
}
