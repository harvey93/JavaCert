package ch5;

public class Swap {
	
	public static int swap(int i){
		int x = 0xaaaaaa;
		int odds = i & x;
		int y = 0x5555555;
		int evens = i & y;
		System.out.println(Integer.toBinaryString(odds >> 1));
		System.out.println(Integer.toBinaryString(evens << 1));
		return i;
	}

}
