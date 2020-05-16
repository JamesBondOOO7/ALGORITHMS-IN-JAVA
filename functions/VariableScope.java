package functions;

public class VariableScope {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		// add(a,b);
		System.out.println(add(a, b));

	}

	public static int add(int a, int b) {
		int res = a + b;
		return res;
	}
}
//POINTS TO REMEMBER:
// variable declared under main() doesn't affect other 
// variables of the same name declared in other functions