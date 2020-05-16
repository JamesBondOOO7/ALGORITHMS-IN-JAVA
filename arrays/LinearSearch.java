package arrays;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the item to be searched : ");
		int item = sc.nextInt();
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println("Item found at index : " + LinearSearch(arr, item));
	}

	public static int LinearSearch(int[] arr, int item) {
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}

		}
		return -1;
	}
}