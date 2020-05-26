package recursion;

public class FirstIndex {

	public static void main(String[] args) {
		int[] arr = { 6, 8, 1, 1, 8, 3, 4 };
		int si = 0 , li = arr.length-1;
		int data = 8;
		System.out.println(firstIndex(arr, si, data));
		System.out.println(lastIndex(arr, li, data));
	}

	public static int firstIndex(int[] arr, int si, int data) {

		if(arr[si]==data)
		{
			return si;
		}
		if(si==(arr.length-1) && arr[si]!=data)
		{
			return -1;
		}
		return (firstIndex(arr, si+1, data));
	}
	public static int lastIndex(int[] arr, int li, int data) {

		if(arr[li]==data)
		{
			return li;
		}
		if(li==0 && arr[li]!=data)
		{
			return -1;
		}
		return (lastIndex(arr, li-1, data));
	}
	
}
