package recursionPrint;

public class PrintSubSequences {

	public static void main(String[] args) {
		printSS("abc", "");
	}
	public static void printSS(String str , String result)
	{
		if(str.length() == 0)
		{
			System.out.print(result+", ");
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		printSS(ros, result);
		printSS(ros, result+cc);
	}
}
