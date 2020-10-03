package spaceAndTimeComplexity;

public class DutchNationalFlag {

	public static void main(String[] args) {
		int [] arr = {1,0,2,1,1,0,2,1,0,2};
		DNF(arr);
		for(int val : arr)
		{
			System.out.print(val + " ");
		}
	}
	
	public static void DNF(int [] arr)
	{
		int lo = 0 , mid = 0 , hi = arr.length-1 ;
		
		while(mid<=hi)
		{
			if(arr[mid] == 0)
			{	int tmp = arr[mid];
				arr[mid] = arr[lo];
				arr[lo] = tmp;
				lo++;
				mid++;
			}
			
			else if(arr[mid] == 1)
			{
				mid++;
			}
			
			else
			{
				int tmp = arr[mid];
				arr[mid] = arr[hi];
				arr[hi] = tmp;
				hi--;
			}
		}
	}

}
