package strings;

import java.util.Scanner;

public class StringOps1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		printsChar(str);
	}
public static void printsChar(String str)
{
	for(int i =0 ;i< str.length(); i++)
	{
		System.out.println(str.charAt(i));
	}
}
}
