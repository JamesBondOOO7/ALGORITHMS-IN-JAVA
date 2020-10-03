package spaceAndTimeComplexity;

public class MergeSort {

	public static void main(String[] args) {
//		int [] arr1 = { 10 , 20 , 30 ,40 , 50};
//		int [] arr2 = { 5 , 15 , 25 , 30 , 45 , 60 , 70 , 80};
//		int [] result = MTSA(arr1, arr2);
		int [] arr = {20,5,90,85,24,77,12};
		int [] ans = MS(arr, 0, arr.length -1);
//		for(int val : result)
//		{
//			System.out.print(val + " ");
//		}
		for(int val : ans)
		{
			System.out.print(val + " ");
		}
	}			
	public static int[] MTSA(int [] arr1 , int [] arr2 )		// Merging Two sorted Arrays
	{
		int merged [] = new int [arr1.length + arr2.length];
		int i = 0 , j = 0 , k = 0 ;
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i] >= arr2[j])
			{
				merged[k] = arr2[j];
				j++;
				k++;
			}
			else
			{
				merged[k] = arr1[i];
				i++;
				k++;
			}
		}
		if(i == arr1.length)
		{
			while(j<arr2.length)
			{
				merged[k] = arr2[j];
				k++;
				j++;
			}
		}
		else
		{
			while(i< arr1.length)
			{
				merged[k] = arr1[i];
				k++;
				i++;
			}
		}
		return merged;
	}
	public static int[] MS(int [] arr , int lo , int hi)
	{
		if(lo == hi)
		{
			int br [] = new int [1];
			br[0] = arr[lo]; 	// or arr[hi]
			return br;
		}
		int mid = (lo + hi)/2;
		int fh[] = MS(arr, lo, mid);
		int sh[] = MS(arr, mid+1, hi);
		int result [] = MTSA(fh, sh);
		return result;
	}
}
