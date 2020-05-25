package strings;

public class Performance {

	public static void main(String[] args) {
		int n = 10000000;
		long start = System.currentTimeMillis();
		PerformaSB(n);
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
public static void PerformaSB(int n)
{
	StringBuilder sb = new StringBuilder("");
	for(int i =1 ; i<= n ;i++)
	{
		sb.append(i);
	}
}
}
/*  		import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		int S = sc.nextInt();
		char [][] park = new char [N][M];
		for(int i = 0;i<N ;i++){
			for(int j =0 ;j<M ;j++){
			park[i][j] = sc.next().charAt(0);
			}
		}
		while(S>=K)
		{
			for(int i=0;i<N;i++)
			{
				for(int j=0;j<M;j++)
				{
					if(park[i][j]=='.')
					{
						S = S-2;
					}
					else if(park[i][j]=='*')
					{
						S = S+5;
					}
					else  // if(park[i][j]=='#')
					{
						S--;
						break;
					}
					S--;
				}
			}
		}
		if(S>=K)
		{System.out.println("Yes");
			System.out.println(S);
		}
		else{
			System.out.println("No");
		}*/
		

