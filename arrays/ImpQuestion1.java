package arrays;

public class ImpQuestion1 {

	public static void main(String[] args) {
		int arr[] =  {1,3,4,6}; 
		/*arr[0] = 1;
		arr[1] = 3;
		arr[2] = 4;
		arr[3] = 6;*/
		
		//int n = 6 ;//arr.length;
		//MissingElements(arr, n);
		Better(arr);
	}

	public static void MissingElements(int [] arr , int n)
	{
		int i , j , count = 0  ;
		int brr[] = new int[n+2];
		for(j=0;j<n+2;j++)
		{
			brr[j] = j+1;
		}
		for(i =0 ; i<n+2; i++)
		{	
			for(j = 0 ; j<n ; j++)
			{
				if(brr[i]==arr[j])
			{
				count++;
				continue;
			}
				
		}
			if(count==0) {
				System.out.println(brr[i]);
			} count =0;
		}
		
	}
	public static void Better(int [] arr )
	{
		int n = arr.length;
		int brr[] = new int[n+2];
		for(int j=0;j<n+2;j++)
		{
			brr[j] = j+1;
		}
		int i=0 , count = 0 , low = 0 ; 
		while (i<n&&count<2)
		{
			if(arr[i]==brr[low]) {
				low++;
			}
			else
			{
				count++;
				System.out.println(brr[low]);
				low++;
				i--;
			}
			i++;
		}
	}
}
