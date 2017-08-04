package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;

public class ConnectedGrid {
	
	public static int BFSGrid(int[][] matrix, int m, int n){
		int res = 0;
		boolean [][] visitGrid = new boolean [m][n];
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				
			}
		}
		return res;
	}
	
	public static ArrayList<ArrayList<Integer>> getCoords(int i, int j, int m, int n){
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		if(i - 1 > 0){
			list.add(new ArrayList<Integer>(Arrays.asList(i-1, j)));
			if(j - 1 > 0){
				list.add(new ArrayList<Integer>(Arrays.asList(i-1, j - 1)));
			}
			if(j + 1 < n){
				list.add(new ArrayList<Integer>(Arrays.asList(i - 1, j + 1)));
			}
			
		}
		if(i + 1 < m){
			list.add(new ArrayList<Integer>(Arrays.asList(i+1, j)));
			if(j - 1 > 0){
				list.add(new ArrayList<Integer>(Arrays.asList(i + 1, j - 1)));
			}
			if(j + 1 < n){
				list.add(new ArrayList<Integer>(Arrays.asList(i + 1, j + 1)));
			}
		}
		if(j - 1 > 0){
			list.add(new ArrayList<Integer>(Arrays.asList(i, j - 1)));
		}
		if(j + 1 < n){
			list.add(new ArrayList<Integer>(Arrays.asList(i, j + 1)));
		}

		return list;
	}
	
	
	public static void printGrid(boolean[][] grid){
		for(boolean[] arr : grid){
			System.out.println(Arrays.toString(arr));
		}
	}
	
	public static void printGrid(int[][] grid){
		for(int[] arr : grid){
			System.out.println(Arrays.toString(arr));
		}
	}

}
