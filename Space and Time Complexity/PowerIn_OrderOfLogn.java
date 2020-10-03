package spaceAndTimeComplexity;

import java.util.Scanner;

public class PowerIn_OrderOfLogn {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int p = sc .nextInt();
		System.out.println(PowerLogn(num, p));

	}
	public static int PowerLogn(int num , int p)
	{
		if( p == 0)
		{
			return 1;
		}
		if(p%2 != 0)
		{
			return PowerLogn(num,p/2)*PowerLogn(num, p/2)*num;
		}
		else
		{
			return PowerLogn(num,p/2)*PowerLogn(num, p/2);
		}
	}
}
