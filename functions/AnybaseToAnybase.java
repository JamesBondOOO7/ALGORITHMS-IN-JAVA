package functions;

import java.util.Scanner;

public class AnybaseToAnybase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number and it's base");
		int num = sc.nextInt();
		int sbase = sc.nextInt();
		System.out.println("Enter the destination base ");
		int dbase = sc.nextInt();
		int result = Anybase(base10(num, sbase), dbase);
		System.out.println("The Answer is : " + result);
	}

	public static int base10(int num, int base) {
		int result = 0, rem, b1 = 1;
		while (num != 0) {
			rem = num % 10;
			result = result + b1 * rem;
			b1 = b1 * base;
			num = num / 10;
		}

		return result;
	}

	public static int Anybase(int num, int base) {
		int result = 0, b1 = 1, rem;
		while (num != 0) {
			rem = num % base;
			result = result + b1 * rem;
			b1 = 10 * b1;
			num = num / base;
		}
		return result;
	}

}
