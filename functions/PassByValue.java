package functions;

public class PassByValue {

	public static void main(String[] args) {
		int a = 10;
		int b  = 20;
		System.out.println(a + " , " + b);
		swap(a,b);
		System.out.println(a + " , " + b);
		
	}

	public static void swap(int c, int d) {
		System.out.println(c + " , " + d);
		int tmp = c;
		c = d;
		d = tmp;
		System.out.println(c + " , " + d);

	}
}
// In PASS BY VALUE method
// swapping through a function doesn't actually swaps the
// 2 numbers. 
// Therefore the value of the original variables exists.