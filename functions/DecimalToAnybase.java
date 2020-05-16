package functions;

import java.util.Scanner;

public class DecimalToAnybase {

	public static void main(String[] args) {
		Scanner sc   = new Scanner ( System .in);
		int num = sc.nextInt();
		int base = sc.nextInt();
		System.out.println("The number in base " + base + " is : " +  
		Anybase(num , base)  );
	}
public static int Anybase(int num , int base )
{
	int result = 0 , b1 =1 ,rem ;
	while(num!=0)
	{
		rem = num%base;
		result = result + b1*rem;
		b1 = 10*b1;
		num =num/base;
	}
	return result;
}
}
