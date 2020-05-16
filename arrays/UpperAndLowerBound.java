package arrays;

public class UpperAndLowerBound {

	public static void main(String[] args) {
		int [] arr ={ 1, 2, 2, 1, 2, 3, 3, 3, 9, 10};
		// Given both arrays are sorted
		System.out.println(LowerBound(arr, 2));
		System.out.println(UpperBound(arr, 3));
		
	}
public static int LowerBound(int [] arr , int target)
{
	int low = 0 , high = arr.length - 1 , mid , result = -1 ;
	while(low<=high)
	{
		mid = (low+high)/2;
		if(arr[mid] == target)
		{
			result = mid ;
			high = mid -1;
			}
		else if (target < arr[mid] )
		{
			high = mid - 1;
		}
		else
		{
			low = mid + 1;
		}
	}
	return result ;
}
public static int UpperBound(int [] arr  , int target)
{
	int low = 0 , high = arr.length - 1 , mid , result = -1 ;
	while(low<=high)
	{
		mid = (low+high)/2;
		if(arr[mid] == target)
		{
			low = mid + 1;
			result = mid ;
		}
		else if (target < arr[mid] )
		{
			high = mid - 1;
		}
		else
		{
			low = mid + 1;
		}
	}
	return result ;
}
}
