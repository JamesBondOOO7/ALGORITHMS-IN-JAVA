package arrays;

import java.util.Scanner;

public class ArrayOperations {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = UserInput();
		display(arr);
	}

	public static int[] UserInput() {
		System.out.println("Enter size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the value for " + i + "Index ");
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
