package hackerRank;

import java.util.*;

public class Test {
	
	static int[][] matrix = {
			{1,1,1,1,1,1,1,1},
			{1,1,0,1,1,1,0,1},
			{1,1,1,1,0,1,1,1},
			{0,1,0,1,1,0,1,1},
			{1,1,0,1,1,1,1,1},
			{1,1,1,0,0,1,0,1},
			{1,0,1,1,1,0,1,1},
			{1,1,1,1,1,1,1,1}
	};
	
	public static void main(String[] args) {
		System.out.println(Bits.lonelyInteger(new int[]{1,1,2,2,3,4,4,5,5}));
		int i = 0b10111;
		int a = i << 1;
		int b = i >> 1;
		System.out.println(a);
		System.out.println(b);
	}
	
}



