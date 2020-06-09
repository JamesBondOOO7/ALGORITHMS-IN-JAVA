package backtracking;

public class CoinChange_Permutation {
public static int count = 0 ;
	public static void main(String[] args) {
		int arr[] = {2,3,5,6};
		CoinChangeP(arr, 10 , "");
	}
	public static void CoinChangeP(int [] arr , int amt ,String ans)
	{
		if(amt == 0)
		{
			count++;
			System.out.println(count + ". " + ans);
			return;
		}
		
		for(int i = 0 ; i< arr.length ; i++)
		{
			if(amt >= arr[i])
			{
				CoinChangeP(arr, amt - arr[i], ans + arr[i]);
			}
		}
		return;
	}
}

