package recursion;

public class Factorial {

	public static void main(String[] args) {
	int n = 4;
	System.out.println(Fact(n));
	}
public static int Factorial(int n)
{
	if(n==0)
	{
		return 1;
	}
	
	return (n*Factorial(n-1));
}
public static int Fact(int n)
{
	if(n==0)
	{
		return 1;
	}
	int fnm1 = Fact(n-1);
	int fn = fnm1*n;
	return fn;
}

}
