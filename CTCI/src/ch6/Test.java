package ch6;
import java.util.*;

public class Test {
	
	public static void main(String[] args) {
		boolean[] arr = Primes.primeSieve(10);
		System.out.println(Arrays.toString(arr));
	}

}
