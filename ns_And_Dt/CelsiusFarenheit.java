package ns_And_Dt;

//import java.util.Scanner;

public class CelsiusFarenheit {

	public static void main(String[] args) {
	//	Scanner sc = new Scanner(System.in);
		int fmin=0;
		int fmax = 300;
		int fah = 0;
		int cel;
		while(fmax>=fah)
		{
		cel = 5*(fah-32)/9;
		fah += 20;
		System.out.println(cel + " " + fah);
		
		}
	}

}
