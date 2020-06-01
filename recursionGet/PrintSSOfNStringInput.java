package recursionGet;
import java.util.Scanner;
import java.util.ArrayList;
public class PrintSSOfNStringInput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] arr = new String [n];
        for(int i = 0 ; i< n ; i++)
        {
            arr[i] = sc.next();
        }
        for(int i = 0 ; i<n ; i++)
        {
            Printfn(Lexo((GetSS(arr[i]))));
        }
    }
    public static ArrayList<String> GetSS( String Org )
        {
            if(Org.length() == 0)
            {
                ArrayList<String> BR = new ArrayList<>();
                BR.add("");
                return BR;
            }
            char cc = Org.charAt(0);
            String ros = Org.substring(1);
            ArrayList<String> MR = new ArrayList<>();
            ArrayList<String> RR = GetSS( ros);
            for(int i = 0 ; i<RR.size() ; i++)
            {
                MR.add(RR.get(i));
                MR.add(cc + RR.get(i));
            }
           return MR;
        }
    public static ArrayList<String> Lexo(ArrayList<String> str)
    {
        for(int i = 0 ; i < str.size() - 1 ; i++)
        {
            for(int j = i + 1 ;j < str.size() ; j++)
            {
                if(str.get(i).compareTo(str.get(j))>0)  // compareTo function  ascii value's difference
                	// if it's greater than zero that means(in this loop which starts from beginning) it should come later in the alphabetical order
                { 
                    String tmp = str.get(i);
                    str.set(i,str.get(j));
                    str.set(j,tmp);
                }
            }
        }
        return str;
    }
    public static void Printfn(ArrayList<String> str)
    {
        for(int i = 0 ; i < str.size() ; i++)
        {
            System.out.println(str.get(i));
        }
    }

}