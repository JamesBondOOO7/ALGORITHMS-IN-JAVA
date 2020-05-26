package recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		String src = "Source";
		String dest = "Destination";
		String helper = "Helper";
		int n = 3;
		toh(n, src, dest, helper);

	}
	// Always assume that your function works before even doing something
	public static void toh(int n , String src  , String dest , String helper )
	{
		if(n==0)
		{
			return;
		}
			toh(n-1,src,helper,dest);
			System.out.println("move " + n + "th disc from " + src + " to " + dest);
			toh(n-1,helper,dest,src);
	}
}
