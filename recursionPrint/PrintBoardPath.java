package recursionPrint;

public class PrintBoardPath {

	public static void main(String[] args) {
		printBP(0, "");
	}

	public static void printBP(int cur, String ans) {
		
		if(cur == 10)
		{
			System.out.println(ans);
			return;
		}
		if(cur > 10)
		{
			return;
		}
		for (int i = 1; i <= 6; i++) {
			
			printBP(cur + i, ans + i);
		}
	}
}
