package recursion;

public class Returning_All_Indicies {

	public static void main(String[] args) {
		int arr[] = {3,8,1,8,8,4};
		int si = 0 , count = 0 , data = 8;
		int [] result = allIndices(arr, si, data, count);
		for(int val : result)
		{
			System.out.print(val + " ");
		}
	}
	public static int[] allIndices(int []arr , int si , int data , int count ) 
	{
		if(si== arr.length)
		{
			int [] base = new int [count];
			return base;
		}
		int [] indices = null;
		if(arr[si] == data)
		{
			indices=allIndices(arr, si+1, data, count+1);
		}
		else
		{
			indices = allIndices(arr, si+1, data, count);
		}
		if(arr[si] == data)
		{
			indices[count] = si;
		}
		return indices;
	}
}
