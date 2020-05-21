package twoDArrays;

import java.util.Scanner;

public class UserInputAndDisplay {

	public static void main(String[] args) {
		int[][] arr = takeInput();
		display(arr);
	}

	private static int [][]takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows ");
		int rows = sc.nextInt();
		int[][] arr = new int[rows][];
		for (int i = 0; i < rows; i++) {
			System.out.println("Enter cols for row:" + i);
			int cols = sc.nextInt();
			arr[i] = new int [cols];
			for (int j = 0; j < cols; j++) {
				System.out.println("Enter the value for element : (" + i + "," + j + ")");
				arr[i][j] = sc.nextInt();
			}

		}
		return arr;
	}
	private static void display(int [][] arr)
	{
		for(int i =0;i<arr.length ; i++)
		{
			for(int j =0 ; j<arr[i].length ; j++)
			{
				System.out.print(arr[i][j] + " ");
			} System.out.println();
		}
	}
}

