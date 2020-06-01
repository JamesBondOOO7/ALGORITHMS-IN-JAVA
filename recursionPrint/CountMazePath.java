package recursionPrint;

public class CountMazePath {

	public static void main(String[] args) {
		System.out.println(countmp(0, 0, 2, 2));
	}

	public static int countmp(int cri, int cci, int dri, int dci) {
		int ways = 0;
		if (cri == dri && cci == dci) {
			return 1;
		}
		if (cri > dri || cci > dci) {
			return 0;
		}
		ways = ways + countmp(cri + 1, cci, dri, dci);
		ways = ways + countmp(cri, cci + 1, dri, dci);
		// ways = ways + countmp(cri+1, cci+1, dri, dci);
		// for diagonal step
		return ways;
	}
}
