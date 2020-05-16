package arrays;

public class MaxElement {

	public static void main(String[] args) {
		int [] arr = { 10 ,5 , 20 ,30 ,25 };
		 int result = Max(arr);
		 System.out.println(result);
	}
	public static int Max(int []arr)
	{
		int result = Integer.MIN_VALUE;
		for(int i =0; i<arr.length;i++)
		{
			result = arr[i]>result?arr[i]:result;
		}
		return result;
	}
}
