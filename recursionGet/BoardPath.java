package recursionGet;

import java.util.ArrayList;

public class BoardPath {

	public static void main(String[] args) {
		System.out.println(getBoardPath(0, 10));
	}

	public static ArrayList<String> getBoardPath(int curr, int end) {
		if(curr == end)
		{
			ArrayList<String> baseCase = new ArrayList<>();
			baseCase.add("\n");
			return baseCase;
		}
		if(curr > end)
		{
			ArrayList<String> baseCase = new ArrayList<>();
			return baseCase;
		}
		ArrayList<String> myResult = new ArrayList<>();
		
		for (int dice = 1; dice <= 6; dice++) {
			
			ArrayList<String> recResult = getBoardPath(curr + dice, end);
			
			for( String val : recResult) {
			
				myResult.add(dice+ val);
			}
		}
		return myResult;
	}
}
