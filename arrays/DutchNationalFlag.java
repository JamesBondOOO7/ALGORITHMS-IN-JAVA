package arrays;

public class DutchNationalFlag {

	public static void main(String[] args) {
		int [] arr = { 1 , 1 ,0 , 2 , 1 , 0 ,2};
		//              0 0 1 1 1 2 2
		DNFprime(arr);
		Display(arr);
		
	}
public static void DNF(int []arr)
{
	for(int counter = 0 ; counter < arr.length -1 ; counter++)
	{
		int min = counter ;
		for(int i = counter+1 ; i<=arr.length - 1;i++)
		{
			if(arr[min]>arr[i])
				min = i;
		}
		int temp = arr[counter];
		arr[counter] = arr[min];
		arr[min] = temp;
	}
}
public static void Display(int[] arr) {
	for (int val : arr) {
		System.out.print(val + " ");
	}
}
// doing this question with time complexity = O(n)
// and with space complexity of order O(n)
public static void DNFprime(int [] arr)
{
	int low = 0 , mid = 0 , high =  arr.length-1 ;
	while (mid<=high)
	{
		if(arr[mid]==0)
		{
			Swap(arr , mid , low);
			mid++;
			low++;
		}
		else if(arr[mid]==1)
		{
			mid++;
		}
		else // i.e arr[mid]==2
		{
			Swap(arr , mid , high);
			high--;
		}
	}
}
public static void Swap(int [] arr , int i , int j)
{
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}
}
