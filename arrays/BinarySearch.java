package arrays;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int [] arr = { 10 ,20 ,30 ,40 ,50 , 60 ,70 ,80 ,90 ,100 ,110 };
		// That the array is sorted
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the item to be searched : ");
		int item = sc.nextInt();
		System.out.println("Item found at index : " + BinarySearch(arr,item));
		sc.close();
	}
	public static int BinarySearch(int []arr , int item)
	{
		int low = 0 , high = arr.length-1 , mid;
		while(low<=high)
		{ 
			mid = (low + high)/2;
			if(arr[mid]<item)
			{
				low = mid +1;
			}
			else if( arr[mid]> item)
			{
				high = mid -1;
			}
			else {               // when arr[mid] == item;
				return mid;
			}
		}
		return -1;
	}
}

