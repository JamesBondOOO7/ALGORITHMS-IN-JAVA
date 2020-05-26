package recursion;

public class LastIndex {
	public static int index = 0;

	public static void main(String[] args) {
		int[] arr = { 3, 8, 1, 8, 8, 7 , 8 };
		int si = 0, data = 8;
		System.out.println(lastIndex(arr, si, data));
		System.out.println(CBlastIndex(arr, si, data));
	}

	public static int lastIndex(int[] arr, int si, int data) {
		if (si == arr.length) {
			return -1; // Base Case
		}
		if (arr[si] == data) {
			index = si;
			lastIndex(arr, si + 1, data);
			return index;
		}

		return lastIndex(arr, si + 1, data);
	}
	public static int CBlastIndex( int [] arr ,int si , int data)
	{
		if(si==arr.length)
		{
			return -1;
		}
		int INDEX = CBlastIndex(arr, si+1, data);
		if(INDEX == -1)
		{
			if(arr[si] == data)
			{
				return si;
			}
			else
			{
				return -1;
			}
		}
		else
		{
			return INDEX;
		}
	}
}
