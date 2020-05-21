package twoDArrays;

public class Important {

	public static void main(String[] args) {
		int [][] arr = new int [3][];
		arr[0] = new int[4];
		arr[1] = new int [3];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[3]);
		System.out.println(arr[0][2]);
		System.out.println(arr[2][0]);//null pointer exception
	}

}
