package recursion;

public class IsSortedOrNot {

	public static void main(String[] args) {
	//	int [] arr = {3 , 8 , 6 , 1 , 9 , 7};
		int [] arr = {1 , 2 , 9 ,4 , 5 };
		int si = 2;
		System.out.println(isSorted(arr, si));
	}
public static boolean isSorted(int [] arr , int si)
{
	if(si==arr.length-1)
	{
		return true;
	}
	if(arr[si]>arr[si+1])
	{
		return false;
	}
	return isSorted(arr, si+1);
}
}
