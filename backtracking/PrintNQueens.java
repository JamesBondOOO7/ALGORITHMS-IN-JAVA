package backtracking;

public class PrintNQueens {

	public static void main(String[] args) {
		boolean [][] board = new boolean [4][4];
		PrintNQ(board, 0, "");

	}
public static void PrintNQ(boolean board [][] , int row , String result)
{
	if(row == board.length)
	{
		System.out.println(result);
		return;
	}
	for(int col = 0 ;col < board[row].length ; col++)
	{
		if(IsItSafe(board , row , col))
		{
			board[row][col] = true;
			PrintNQ(board, row+1 , result + "{ " + (row + 1) + " - " + (col+1) + " } ; ");
			// we don't need to care about the appended string because :
			// 1 - it is a local entity in any random layer of stack thus append takes place for each combination
			// 2 - result gets appended as we pass it each time ; Note return type of this function is void 
			// 3 - not every (local) result is printed as the base condition is not met
			board[row][col] = false;
		}
	}
}
private static boolean IsItSafe(boolean [][] board , int row , int col)
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
