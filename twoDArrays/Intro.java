package twoDArrays;

import java.util.Scanner;

public class Intro {

	public static void main(String[] args) {
		int[][] arr;
		arr = new int[3][4];
		// or
//		int [][] arr1 = new int [3][3];
//		System.out.println(arr);
		arr[0][0] = 1101;
		arr[0][2] = 301;
		arr[0][3] = 9;
		arr[1][1] = 978;
		arr[1][3] = 65;
		arr[2][2] = 898;
		display(arr);
	}
public static void display(int [][] arr)
{
	for(int i =0 ; i<arr.length ; i++)
	{
		for(int j=0 ; j<arr[i].length ;j++)
		{
			System.out.print(arr[i][j] + "   ");
		}System.out.println();
	}
}
}
