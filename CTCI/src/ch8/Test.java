package ch8;


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
		TowersOfHanoi game = new TowersOfHanoi(5);
		game.solve();
		System.out.println(game.t1);
		System.out.println(game.t2);
		System.out.println(game.t3);
		
	}
}









