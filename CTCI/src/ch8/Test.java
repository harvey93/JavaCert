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
	
	static Color[][] screen = {
			{Color.W, Color.W, Color.W, Color.W, Color.W, Color.W, Color.W},
			{Color.W, Color.W, Color.B, Color.B, Color.B, Color.B, Color.W},
			{Color.W, Color.W, Color.B, Color.W, Color.W, Color.B, Color.W},
			{Color.W, Color.W, Color.B, Color.W, Color.W, Color.B, Color.W},
			{Color.W, Color.W, Color.B, Color.W, Color.W, Color.B, Color.W},
			{Color.W, Color.W, Color.B, Color.B, Color.B, Color.B, Color.W},
			{Color.W, Color.W, Color.W, Color.W, Color.W, Color.W, Color.W},
			{Color.W, Color.W, Color.W, Color.W, Color.W, Color.W, Color.W},
			
			
	};


	public static void main(String[] args) {
		ArrayList<Integer []> list = Queens.eightQueens();
		for(Integer[] a : list){
			System.out.println(Arrays.toString(a));
		}
		
	}
}









