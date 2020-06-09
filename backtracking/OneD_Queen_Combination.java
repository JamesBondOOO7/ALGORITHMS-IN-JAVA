package backtracking;

public class OneD_Queen_Combination {
public static int count = 0 ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		OneDQC(new boolean [4], 0, 2, "",0);
//		System.out.println();
//		System.out.println();
		OneDQCbyCB(new boolean [4], 0, 2, "",-1);
	}
	public static void OneDQC(boolean [] boxes , int qpsf , int tq , String ans , int combo)
	{

		// BASE CASE
		if(qpsf == tq)
		{
			count++;
			System.out.println(count + ". " + ans);
			return;
		}
		for(int i = 0 ; i< boxes.length ; i++)
		{
			if(i>=combo && boxes[i] == false)
			{
				boxes[i] = true;
				OneDQC(boxes, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + " ",i);
				boxes[i] = false;	// UNDO STEP
			}
		}
			return;
	}
	
	public static void OneDQCbyCB(boolean [] boxes , int qpsf , int tq , String ans , int lastBoxUsed)
	{

		// BASE CASE
		if(qpsf == tq)
		{
			count++;
			System.out.println(count + ". " + ans);
			return;
		}
		for(int i = lastBoxUsed + 1 ; i< boxes.length ; i++)
		{
				boxes[i] = true;
				OneDQCbyCB(boxes, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + " ",i);
				boxes[i] = false;	// UNDO STEP
		}
			return;
	}
}
