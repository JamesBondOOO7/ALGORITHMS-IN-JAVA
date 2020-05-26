package recursion;

public class BubbleSorting {
public static int counter = 0;
	public static void main(String[] args) {
	int []	arr = {50 ,40,30,20,10};
	int si = 0 , li = arr.length-1;
	BubbleSort(arr, si, li);
	for(int val : arr)
	{
		System.out.print(val + " ");
	}
	}
	public static void BubbleSort(int [] arr , int si ,int li)
	{
		if(li==0)
		{
			return;
		}
		if(si == li)
		{
			BubbleSort(arr, 0 , li-1);
			return;// so that the statements below doesn't get executed
		}
		if(arr[si]>arr[si+1])
		{
			int tmp = arr[si];
			arr[si] = arr[si+1];
			arr[si+1] = tmp;
			
		}
		BubbleSort(arr, si+1, li);
		}
}
