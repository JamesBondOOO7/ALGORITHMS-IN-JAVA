package backtracking;

public class OneD_Queen_Permutation {
public static int count = 0 ;
	public static void main(String[] args) {
		OneDQP(new boolean [4], 0, 2, "");
	}
	public static void OneDQP(boolean [] boxes , int qpsf , int tq , String ans)
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
			if(boxes[i] == false)
			{
				boxes[i] = true;
				OneDQP(boxes, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + " ");
				boxes[i] = false;	// UNDO STEP
			}
		}
			return;
	}
}
