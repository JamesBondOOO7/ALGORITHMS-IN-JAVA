package recursion;

public class RecursionDemo {

	public static void main(String[] args) {
		int n = 5 ;
		PDI(n);
	}
public static void PD(int n) {
	if(n==0)
	{
		return;
	}
	System.out.println(n);
	PD(n-1);
}
public static void PI(int n )
{
	if(n==0)
	{
		return;
	}
	PI(n-1);
	System.out.println(n);
}
public static void PDI(int n)
{
	if(n==0)
	{
		return;
	}
	System.out.println(n);
	PDI(n-1);
	System.out.println(n);
}
}
