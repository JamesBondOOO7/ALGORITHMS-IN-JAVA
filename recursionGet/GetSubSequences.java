package recursionGet;
import java.util.ArrayList;
public class GetSubSequences {

	public static void main(String[] args) {
		String str = "abcd";
		ArrayList <String> Result = new ArrayList<>();
		Result = getSS(str);
		for(String val : Result )
		{
			System.out.println(val);
		}
	}	

	public static ArrayList<String> getSS(String str) {
		if(str.length() == 0)
		{
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> myResult = new ArrayList<>();
		ArrayList<String> recResult = getSS(ros); 
		for(int i =0 ; i<recResult.size() ; i++)
		{
			myResult.add(recResult.get(i));
			myResult.add(cc + recResult.get(i));
		}
		return myResult;
		
	}
}
