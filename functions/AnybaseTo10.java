package functions;

import java.util.Scanner;

public class AnybaseTo10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int base = sc.nextInt();
		System.out.println("The equivalent of the given number " + "in base 10 is:  " + base10(num, base));
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
}
