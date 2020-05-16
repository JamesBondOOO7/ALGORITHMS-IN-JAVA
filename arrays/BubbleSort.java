package arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 3 , 2 , 4 , 5 , 1 };
		BubbleSort(arr);
		Display(arr);
	}

	public static void BubbleSort(int[] arr) {
		int counter, j;
		for (counter = 0; counter < arr.length - 1; counter++) {
			for (j = 0; j < arr.length - counter - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void Display(int[] arr) {
		for (int val : arr) {
			System.out.println(val);
		}
	}
}
