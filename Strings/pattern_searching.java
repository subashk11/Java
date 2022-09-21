package Strings;

public class pattern_searching {

    //In this problem we are given a plain text and a pattern
    //we need to print the starting index of the pattern found in the plain text

    //1.Naive Approach O((n-m+1)*m)
    static void naiveApp(String pl,String patt)
    {
        //Here we use sliding so that we slide the pattern text to each set in the plain text
        //if the pattern matches return the index

        int n=pl.length();
        int m=patt.length();
        //loop that runs upto n-m times eg: AABCDESDFG patt:CEDS
        //i runs upto 6 so after that it is not possible to get the patters as the size of pattern is more
        for (int i = 0; i < n-m; i++) {
            int j;
            //loop that checks each charcter set with the pattern text
            for (j = 0; j < m; j++) {
                //if the items not matches break the loop
                if (pl.charAt(j+i)!=patt.charAt(j))
                {
                    break;
                }
            }
            //if the above loop runs fully then the index of j becomes the length of the patterns
            //As it matches all the text so we return the index of i which is the position of the patterns in the plain text
            if (j==m)
            {
                System.out.print(i+" ");
            }
        }
    }

    //Enhanced naive approach -used when the pattern in distinct in character
    static void enNaiveApp(String pl,String patt)
    {
        //Here we slide the patt to i+j when we found a match till j>1
        //Refer gfg video for further reference for this implementation
        int m=patt.length();
        int n=pl.length();
        //loop that runs through the plain text till m-n
        //Here we are not incrementing i for every loop
        //if we find j>1 then we directly slide the window to i+j as the pattern character are unique
        //else we increment i by 1
        for (int i = 0; i <= n-m; ) {
            //Same as naive approach
            int j;
            for (j=0;j<m;j++)
            {
                if (pl.charAt(i+j)!=patt.charAt(j)) break;
            }
            //here er check
            if (j==m)
            {
                System.out.print(i+" ");
            }
            if(j==0)
            {
                i++;
            }
            else {
                i=i+j;
            }
        }
    }

    public static void main(String[] args) {
        String plain="AABCBASCABCD";
        String pattern="ABC";
        naiveApp(plain,pattern);
        System.out.println();
        enNaiveApp(plain,pattern);
    }
}
