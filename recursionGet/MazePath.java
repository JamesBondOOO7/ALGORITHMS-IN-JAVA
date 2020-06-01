package recursionGet;

import java.util.ArrayList;

public class MazePath {

	public static void main(String[] args) {
		System.out.println(getMP(0, 0, 2, 2));
	}

	public static ArrayList<String> getMP(int ri, int ci, int eri, int eci) {
		if(ri==eri && ci== eci)
		{
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}
		if(ri >eri || ci > eci)
		{
			ArrayList<String> baseResult = new ArrayList<>();
			return baseResult;
		}
		ArrayList<String> recResult = new ArrayList<>();
		ArrayList<String> myResult = new ArrayList<>();
		recResult = getMP(ri , ci + 1, eri, eci);
		for( String strh : recResult)
		{
			myResult.add("H" + strh);
		}
		recResult = getMP(ri + 1, ci, eri, eci);
		for( String strv : recResult)
		{
			myResult.add("V" + strv);
		}
//		recResult = getMP(ri + 1, ci + 1, eri, eci);
//		for( String strd : recResult)
//		{
//			myResult.add("D" + strd);
//		}
		// if diagonal step is also allowed then use this loop and 
		// recursive call
		return myResult;
	}
}
