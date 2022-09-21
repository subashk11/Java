package Strings;

public class Rabin_karp {
    //d is the size of the alphabet
    final static int d=256;
    //Function to perform rabin karp
    static void rabinKarp(String pat,String txt,int q)
    {
        //calculate the length of the pattern
        int m=pat.length();
        //Calculate the length of the text
        int n=txt.length();
        int i,j;
        //This is the hash value of pattern
        int p=0;
        //This is the hash value of each sliding text
        int t=0;
        int h=1;

        //The value of h is the pow(d,m-1)%q
        for (i=0;i<m-1;i++)
            h=(h*d)%q;

        //To calculate the hash value
        for (i = 0; i < m; i++) {
            //hash value of pattern p
            p=(d*p+pat.charAt(i))%q;
            //hash value of the sliding text
            t=(d*t+txt.charAt(i))%q;
        }

        //This is the loop that slides through the plain text
        for (i = 0; i <= n-m ; i++) {

            //if the hash values of both p and t are equal
            //then check the individual chararcter
            if (p==t)
            {
                for(j=0;j<m;j++)
                {
                    if (pat.charAt(j)!=txt.charAt(i+j))
                        break;
                }
                if (j==m)
                {
                    System.out.println(i+" ");
                }
            }

            //if both the hash function are not equal the slide to
            //the next window
            //it is not a valid pattern as i moves greater than n-m
            if (i<n-m)
            {
                t=(d*(t-txt.charAt(i)*h)+txt.charAt(i+m))%q;

                //in modulo we might get a negative value
                //in that case we do
                if (t<0)
                {
                    t=(t+q);
                }
            }
        }
    }

    public static void main(String[] args) {
        String txt="GEEKSFORGEEKS";
        String patt="GEEK";
        //q should be a prime number of greater size
        int q=101;

        rabinKarp(patt,txt,q);
    }
}
