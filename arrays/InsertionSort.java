package arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int []arr = { 88 , 11 , 44 ,99 ,33};
		InsertionSort(arr);
		Display(arr);
		
		
	}
	public static void InsertionSort(int [] arr)
	{
			for(int counter = 1; counter <=arr.length -1 ;counter++)
			{
				int val = arr[counter];
				int j = counter - 1;
				while(j>=0 && arr[j]>val)
				{
					arr[j+1] = arr[j];
					j--;
				}
				arr[j+1] = val;
			}
	}
	public static void Display(int[] arr) {
		for (int val : arr) {
			System.out.println(val);
		}

	}
}
