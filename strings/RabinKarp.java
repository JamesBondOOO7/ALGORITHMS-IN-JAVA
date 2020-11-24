package strings;

public class RabinKarp {

    public static void main(String[] args) {

        // String => n ; Substring => m

        // String Matching
        // 1. Brute-force : O( n*m )

        // 2. Rabin-Karp : O( n+m )
        // but worst case will still be O( n*m )

        // Concept of Rolling Hash

        String str = "ababcabdababd";
        String pat = "abd";

        int hp = hash(pat);

        int tempHash = hash(str.substring(0, pat.length()));
        boolean flag = false;

        for( int i = 0 ; i<=str.length() - pat.length() ; i++)
        {
            if( tempHash == hp )
            {
                // match the string
                if( stringMatch(str.substring(i, i + pat.length() ), pat))
                {
                    System.out.println("String Matched at index : " + i);
                }
                flag = true;
                break;
            }

            else
            {
                tempHash = tempHash - str.charAt(i) + str.charAt( i + pat.length() );
//                System.out.println(hp + " - " + tempHash);
            }

        }

        if ( !flag )
        {
            System.out.println("No Match found");
        }



    }

    public static int hash(String str)
    {
        int hash_value = 0;

        for( int i = 0 ; i< str.length() ; i++)
        {
            // Adding the ascii value
            hash_value += str.charAt(i);
        }

        return  hash_value;
    }

    public static boolean stringMatch(String s1, String s2)
    {
        // The lengths of the strings is gonna be same

        for( int i = 0 ; i<s1.length() ; i++)
        {
            if( s1.charAt(i) != s2.charAt(i) )
            {
                return false;
            }
        }

        return true;
    }
}
