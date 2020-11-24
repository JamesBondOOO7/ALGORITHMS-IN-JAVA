package arrays;

import java.util.ArrayList;

public class RadixSort {

    public static void main(String[] args) {
        int [] arr = {15, 1, 321, 10, 802, 2, 123, 90, 109, 11};

        int max = -1;

        for( int i = 0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
            if( arr[i] > max )
            {
                max = arr[i];
            }
        }
        System.out.println();

        int maxLen;
        maxLen = (max + "").length();

        String [] srr = new String[arr.length];

        for(int i = 0; i<arr.length ; i++)
        {
            srr[i] = arr[i] + "";

            while (srr[i].length() < maxLen)
            {
                srr[i] = "0" + srr[i];
            }
        }

//        for( String str : srr)
//        {
//            System.out.print(str + " ");
//        }
//        System.out.println();

        // Radix Sort

        int base = 10;
        ArrayList<ArrayList<String>> buckets = new ArrayList<>();
        for( int i = 0 ; i<base ; i++)
        {
            buckets.add(new ArrayList<String>());
        }

        for( int pass = 0 ; pass<maxLen; pass++)
        {
            for( int i = 0; i< srr.length ; i++)
            {
                int ch = srr[i].charAt(maxLen - pass - 1);
                buckets.get(ch-48).add(srr[i]);
            }

            int idx = 0;
            for( int i = 0 ; i<base ; i++)
            {
                if( buckets.get(i).size() != 0 )
                {
                    for( String val : buckets.get(i))
                    {
                        srr[idx] = val;
                        idx++;
                    }

                    buckets.get(i).clear();
                }
            }
        }

        for( int i = 0 ; i<arr.length ; i++)
        {
            arr[i] = Integer.parseInt(srr[i]);
            System.out.print(arr[i] + " ");
        }
    }

}
