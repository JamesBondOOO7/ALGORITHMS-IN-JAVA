package arrays;

public class Intro {

	public static void main(String[] args) {
		// declare
		int [] arr = null ;
		System.out.println(arr);
		// allocate space
		arr = new int [5];
		System.out.println(arr);
		// Input
		for(int i  = 0 ; i<arr.length; i++)
		{
			arr[i] = 10+i;
		}
		for(int val:arr)
		{
			val = 60;
			System.out.println(val);
		}
	}

}
