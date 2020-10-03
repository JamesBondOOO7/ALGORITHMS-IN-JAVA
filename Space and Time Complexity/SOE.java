package spaceAndTimeComplexity;

import java.util.Scanner;

public class SOE {
	public static void main(String[] args) {
		// Seive Of Eratosthenes
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// We have to print all the prime numbers upto n
		
		/* Motive of SOE:
		 *
		 * We will check the numbers upto n^0.5
		 * as factors exist upto n^0.5 and then it starts repeating.
		 * 
		 * We will try to remove the multiples of the factors we traverse
		 * from that number to n^0.5 ( excluding that number )
		 * 
		 * We go further along and will not consider those factors between
		 * 2 to n^0.5 which were cancelled out.
		 * 
		 * 
		 * TIME COMPLEXITY COMES OUT TO BE:
		 * 
		 * n * ( sum of reciprocals of prime numbers )
		 * 
		 * ==> n * ( 1/2 + 1/3 + 1/5 + 1/7 + ... )
		 * ==> n * log(log(n))
		 * 
		 * = O( n*log(log(n))
		 */
		
		boolean [] arr = new boolean [n+1];
		
		
		for( int i = 2 ; i<=n ; i++)
		{
			arr[i] = true;
		}
		
		for( int i = 2; i*i<=n ; i++)
		{
			if( arr[i] == true )
			{
				for(int j = 2 ; i*j <= n ; j++)
				{
					arr[i*j] = false;
					
				}
			}
		}
		
		for( int i = 2 ; i<=n ; i++)
		{
			if( arr[i] == true )
			{
				System.out.println(i);
			}
		}
	}	
}



















