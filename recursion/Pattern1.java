package recursion;

public class Pattern1 {

	public static void main(String[] args) {
		int n = 5, row = 1, col = 1;
		long start = System.currentTimeMillis();
		 Pattern(n, row, col);
		//CBPattern(n, row, col);
		 long end = System.currentTimeMillis();
		 System.out.println(end - start);
	}

	public static void Pattern(int n, int row, int col) {
		if (row == col && row <= n) {
			System.out.print("*");
			System.out.println();
			Pattern(n, row + 1, 1);
			//return ;
		}
		if (row > col && row <= n) {
			System.out.print("*");
			Pattern(n, row, col + 1);
		}

	}

	public static void CBPattern(int n, int row, int col) {
		if (row > n) {
			return;
		}
		if (col > row) {
			System.out.println();
			CBPattern(n, row + 1, 1);
			return;
		}
		System.out.print("*");
		CBPattern(n, row, col + 1);
	}
}
