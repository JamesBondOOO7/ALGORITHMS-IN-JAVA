package backtracking;

public class CoinChange_Combination {

	public static void main(String[] args) {
		int arr[] = {2,3,5,6};
		CoinChange(arr, 10 , "", 0);
	}
	public static void CoinChange(int [] arr , int amt ,String ans , int last_arr_Index )
	{
		if(amt == 0)
		{
			System.out.println(ans);;
			return;
		}
		
		for(int i = last_arr_Index ; i< arr.length ; i++)
		{
			if(amt >= arr[i])
			{
				CoinChange(arr, amt - arr[i], ans + arr[i], i);
			}
		}
		return;
	}
}

