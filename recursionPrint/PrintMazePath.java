package recursionPrint;

public class PrintMazePath {

	public static void main(String[] args) {
		
		printmp(0, 0, 2, 2, "");
	}
	public static void printmp(int cri , int cci , int dri , int dci , String result)
	{
		if(cri==dri && cci == dci)
		{
			System.out.println(result);
			return;
		}
		if(cri > dri || cci > dci)
		{
			return;
		}
		printmp(cri+1,cci,dri,dci,result + "V");
		printmp(cri, cci+1, dri, dci, result + "H");
		// printmp(cri+1, cci+1, dri, dci, result + "D");
		// for diagonal step
	}
}
 