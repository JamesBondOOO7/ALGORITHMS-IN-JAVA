package backtracking;

public class CountNQueens {

	public static void main(String[] args) {
		boolean [][] board = new boolean [5][5];
		System.out.println(CountNQ(board, 0));

	}
public static int CountNQ(boolean board[][] , int row)
{
	if(row == board.length)
	{
		return 1;
	}
	int count = 0;
	for(int col = 0 ;col < board[row].length ; col++)
	{
		if(IsItSafe(board , row , col))
		{
			board[row][col] = true;
			count = count + CountNQ(board, row+1);
			board[row][col] = false;
		}
	}
	return count;
}
private static boolean IsItSafe(boolean [][] board , int row , int col)
{
	for(int i = 0 ; i < board[row].length; i++)				// i=0 will not change the result as that value is not yet true
	{
			if(row-i>=0 && col-i >=0 && board[row-i][col-i] == true)
			{									// left diagonal
				return false;
			}
			else if(row-i>=0 && board[row-i][col] == true)
			{									// upper line
				return false;
			}
			else if(row-i >= 0 && col + i < board[i].length && board[row-i][col+i] == true)
			{									// right diagonal
				return false;
			}
	}
	return true;
}
private static boolean IsItSafeCB(boolean [][] board , int row , int col)
{
	// i = row will not change the result as that coordinate is not yet true
	for(int i = row ; i >=0 ; i--)
	{
		if(board[i][col] == true)
		{							// upper line
			return false;
		}
	}
	for(int i = row , j= col ; i>=0 && j >=0 ; i-- , j--)
	{
		if(board[i][j] == true)
		{							// left diagonal
			return false;
		}
	}
	for(int i = row , j = col ; i>=0 && j<board.length ; i-- , j++ )
	{
		if(board[i][j] == true)
		{							// right diagonal
			return false;
		}
	}
	return true;
}
}
