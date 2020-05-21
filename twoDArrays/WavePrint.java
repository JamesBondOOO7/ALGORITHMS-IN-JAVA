package twoDArrays;

public class WavePrint {

	public static void main(String[] args) {
		int [][] arr = new int [4][4];
		for(int i = 0 ; i<arr.length ;i++)
		{
			for(int j =0 ; j<arr[i].length ; j++)
			{
				arr[i][j] = (i+1)*10 + j+1;
			}
		}
		display(arr);
	}
public static void display(int[][] arr)
{
	for(int i = 0 ;i<arr.length ; i++)
	{
		for(int j = 0 ;j<arr[i].length ; j++)
		{
			if(i%2!=0)
			{
				System.out.print(arr[i][arr[i].length - j-1] + " ");
			}
			else
			{
				System.out.print(arr[i][j] + " ");
			}
		}
	}
}
}
