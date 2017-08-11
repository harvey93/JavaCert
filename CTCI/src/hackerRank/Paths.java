package hackerRank;

public class Paths {
	
	public static int count(int[][] matrix){
		
		return countRec(0, 0, matrix);
		
	}
	
	public static int countRec(int row, int col, int[][] matrix){
		
		return 5;
	}
	
	public static boolean validPath(int row, int col, int[][] matrix){
		boolean res = true;
		if(row > matrix.length - 1 || row < 0){
			res = false;
		}else if(col > matrix[0].length - 1 || col < 0){
			res = false;
		}else if (matrix[row][col] == 0){
			res = false;
		}		
		
		return res;
	}

}
