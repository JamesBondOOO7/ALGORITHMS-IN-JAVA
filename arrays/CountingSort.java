package arrays;

public class CountingSort {

    public static void main(String[] args) {

        // for positive numbers only

        int [] arr = {2, 1, 1, 0, 2, 5, 4, 0, 2, 8, 7, 7, 9, 2, 0, 1, 9};

        for( int ele : arr )
        {
            System.out.print(ele + " ");
        }
        System.out.println();

        // k value
        int k = -1;
        for( int i = 0 ; i<arr.length ; i++)
        {
            if( arr[i] > k)
            {
                k = arr[i];
            }
        }

        int [] count = new int [k + 1];

        // Frequency
        for( int i = 0 ; i<arr.length ; i++)
        {
            count[arr[i]]++;
        }

        // Cummulative Frequency
        for(int i = 1; i<count.length ; i++)
        {
            count[i] += count[i-1];
        }

        // Sorting : Placing the elements
        int [] answer = new int [arr.length];

        // Starting from last to maintain stability of the algorithm
        // i.e equal numbers will also get in different order

        for( int i = arr.length-1; i>=0 ; i--)
        {
            count[arr[i]] -= 1;
            answer[count[arr[i]]] = arr[i];
        }

        for( int ele : answer )
        {
            System.out.print(ele + " ");
        }


    }
}
