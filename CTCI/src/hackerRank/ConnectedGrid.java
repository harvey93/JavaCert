package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class ConnectedGrid {
	
	public static int BFSGrid(int[][] matrix, int m, int n){
		int max = 0;
		
		
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				max = Math.max(max, getCounts(matrix, i, j));
			}
		}
		return max;
	}
	
	
	public static int getCounts(int[][] matrix, int i, int j){
		if(i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length){
			return 0;
		}
		if(matrix[i][j] == 0){return 0;}
		int count = matrix[i][j]--;
		count += getCounts(matrix, i + 1, j);
		count += getCounts(matrix, i - 1, j);
		count += getCounts(matrix, i, j + 1);
		count += getCounts(matrix, i, j - 1);
		count += getCounts(matrix, i + 1, j + 1);
		count += getCounts(matrix, i + 1, j - 1);
		count += getCounts(matrix, i - 1, j + 1);
		count += getCounts(matrix, i - 1, j - 1);
		return count;
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
