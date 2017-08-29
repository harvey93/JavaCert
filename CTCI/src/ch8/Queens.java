package ch8;
import java.util.*;

public class Queens {
	
	private static int GRID_SIZE = 8;
	
	public static ArrayList<Integer []> eightQueens(){
		ArrayList<Integer []> result = new ArrayList<>();
		Integer[] cols = new Integer[GRID_SIZE];
		eightQueens(GRID_SIZE - 1, cols, result);
		return result;
	}
	
	private static void eightQueens(int row, Integer[] cols, ArrayList<Integer[]> result){
		if(row == GRID_SIZE){
			result.add(cols.clone());
		}else {
			for(int col = 0; col < GRID_SIZE; col++){
				if(checkValid(cols, row, col)){
					cols[row] = col;
					eightQueens(row + 1, cols, result);
				}
			}
		}
	}
	
	
	private static boolean checkValid(Integer [] cols, int row, int col){
		boolean res = true;
		for(int row2 = 0; row2 < row; row2++){
			
		}
		return res;
	}
}
