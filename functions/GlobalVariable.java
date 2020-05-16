package functions;

public class GlobalVariable {
public static int val = 40;
	public static void main(String[] args) {
		System.out.println(val);
		val =  val +10;
		int val = 10;
		System.out.println(val);
		System.out.println(GlobalVariable.val);
		go();
	}

public static void go()
{
	System.out.println(val);
	int a = val + 20;
	System.out.println(a);
	System.out.println(a + GlobalVariable.val);
}
}
// POINTS TO REMEMBER:
// Global variable declaration 
// Global variables are stored in HEAP
// public static int var_name  =  value;
// to print the global variable 
// System.out.println(class_name.var_name);