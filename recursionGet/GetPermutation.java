package recursionGet;
import java.util.ArrayList;
public class GetPermutation {

	public static void main(String[] args) {
	System.out.println(GetP("abc"));
	}
public static ArrayList<String> GetP (String str)
{
	if(str.length() == 0)
	{
		ArrayList<String> baseresult = new ArrayList<>();
		baseresult.add("");
		return baseresult ;
	}
	char ch = str.charAt(0);
	String ros = str.substring(1);
	ArrayList<String> recResult = GetP(ros);
	ArrayList<String> myResult = new ArrayList<>();
//	for( int i = 0 ; i<recResult.size();i++)
//	{	
//		StringBuilder sb = new StringBuilder(recResult.get(i));
//		for(int j  = 0 ; j <= sb.length(); j++)
//		{
//			String strito = new String(sb.insert(j,ch));
//			myResult.add(strito);
//       		sb.delete(j,ch);
//		}
//	}***************************
//	for( String val : recResult)
//	{
//		for(int i = 0 ; i<=val.length() ; i++)
//		{
//		StringBuilder result = new StringBuilder();
//		result.insert(i,ch);
//		String s = new String(result);
//		myResult.add(s);
//		}
//	}****************************
	for( String val : recResult)
	{
		for(int i = 0 ; i<=val.length() ; i++)
		{
		String result = val.substring(0,i) + ch + val.substring(i);
		myResult.add(result);
		}
	}
	return myResult ;
	
}
}
