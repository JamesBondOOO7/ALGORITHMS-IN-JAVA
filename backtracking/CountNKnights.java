package backtracking;

public class CountNKnights {

	public static void main(String[] args) {
		
		boolean [][] board = new boolean[2][2];
		System.out.println(CountNK(board, 0, 0, 0));
	}
	
	public static int CountNK( boolean [][] board , int cr , int cc ,int placed)
	{
		if(placed == board.length) {
			return 1;
		}
		int count = 0;
		for(int col = cc ; col<board.length ; col++)
		{
			if(isItSafe(board , cr , col))	// true
			{
				board[cr][col] = true;
				count = count + CountNK(board, cr, col + 1, placed + 1);
				board[cr][col] = false;		//Undo step
			}
		}
		
		for(int row = cr + 1 ; row<board.length ; row++)
		// a new row
		{	// Therefore we will start from a new column
			for(int col = 0 ; col<board.length ; col++)
			{
				if(isItSafe(board , row , col))
				{
					board[row][col] = true;
					count = count + CountNK(board, row, col + 1, placed + 1);
					board[row][col] = false;	// Undo step
				}
			}
		}
		return count;
	}
	
	public static boolean isItSafe(boolean [][] board , int row , int col)
	{
		
		// No need to check for forward rows as those are not occupied yet
		
		if(row - 2 >= 0 && col - 1 >= 0 && board[row-2][col-1])
		{
			return false;
		}
		
		if(row - 2 >= 0 && col + 1 < board.length && board[row-2][col+1])
		{
			return false;
		}
		
		if(row - 1 >= 0 && col - 2 >= 0 && board[row-1][col-2])
		{
			return false;
		}
		
		if(row - 1 >= 0 && col + 2 < board.length && board[row-1][col+2])
		{
			return false;
		}
		return true;
	}
}
