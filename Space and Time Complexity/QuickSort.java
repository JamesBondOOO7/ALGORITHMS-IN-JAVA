package spaceAndTimeComplexity;

public class QuickSort {

	public static void main(String[] args) {

		int [] arr = {40 , 20 , 90 , 30 , 70 , 10 , 80 , 60 , 50};
		
		QS(arr,0,arr.length - 1);
		for(int val : arr)
		{
			System.out.print(val + " ");
		}
	}
public static void QS(int [] arr , int lo , int hi)
{
	
	// Base case
	
	if(lo >= hi)
	{
		return;
	}
	int mid = (lo + hi)/2;
	int pivot = arr[mid];	// pivot can be any element in the array
	int left = lo;
	int right = hi;
	
	// Partitioning
	while(left<=right)
	{
		while (arr[left] < pivot)
		{
			left++;
		}
		
		while (arr[right] > pivot)
		{
			right--;
		}
		
		if(left <= right)		// This condition is applied as it might happen that
		{						// left becomes > than right but loop still works for
			int temp = arr[left];	// that iteration.
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
		}
	}
	
	// RECURSIVE CALLS
	
	QS(arr,lo,right);
	QS(arr,left,hi);
}
}
