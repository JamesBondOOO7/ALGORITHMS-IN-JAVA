package arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 50, 140, 100, 98, 10 };
		SelectionSort(arr);
		Display(arr);

	}

	public static void SelectionSort(int[] arr) {
		for (int counter = 0; counter < arr.length - 1; counter++) {
			int min = counter;
			for (int j = counter + 1; j < arr.length ; j++) {
				if (arr[min] > arr[j])
					min = j;
			}
			int tmp = arr[min];
			arr[min] = arr[counter];
			arr[counter] = tmp;
		}
	}

	public static void Display(int[] arr) {
		for (int val : arr) {
			System.out.println(val);
		}
	}
}
