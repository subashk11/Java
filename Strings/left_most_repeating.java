package Strings;

import java.util.Arrays;

public class left_most_repeating {
    static final int chacSize=256;
    //This problem is to return the index of the left most character which is repeating
    //Eg: I/O :abbcc O/P : 1 because b is the left most repeating character at index 1
    //I/O: abcd O/P : -1 because none of the character is repeating
    //I/O : aabbcc O/p : 0 because a character is repeating first and its index is 0

    //Naive approach for the problem
    static int leftMost(String s1)
    {
        //Traverse each string for entire time
        for(int i=0;i<s1.length();i++)
        {
            //Inner loop that checks for each item is equal to the ith index character
            for(int j=i+1;j<s1.length();j++)
            {
                //condition that checks the char is same and if same return the index
                if(s1.charAt(i)==s1.charAt(j))
                {
                    return i;
                }
            }
        }
        return -1;
    }

    //Better Approach
    static int leftMostB(String s1)
    {
        //Here we create an array to maintain the count of each char occurence
        //We create an array of size 256
        int[] newChar=new int[chacSize];
        //all the items have default value of zero
        //Now we traverse through each item in the string and increment their respective index
        for(int i=0;i<s1.length();i++)
        {
            //the ascci value of a is 96 then character[96] is now incremented and so on.
            newChar[s1.charAt(i)]++;
        }
        //Then we traverse through the loop if we find another occurence then return in
        for(int i=0;i<s1.length();i++)
        {
            //checks for the size whose size is greater than 1
            if(newChar[s1.charAt(i)]>1)
            {
                return i;
            }
        }
        return -1;
    }

    //Efficient Approach
    static int leftMostE(String s1)
    {
        //The approach is to make a reserve index or the minimum index in each traversal
        int[] newArr=new int[chacSize];
        //Now fill the array values as -1
        Arrays.fill(newArr,-1);
        //As we assume that there is no occerence of the char is found

        //Create a res to main the low index or left most index
        int res=Integer.MAX_VALUE;

        //Create a loop to traverse through the string
        for (int i = 0; i < s1.length(); i++) {
            int fi=newArr[s1.charAt(i)];
            if(fi==-1)
            {
                newArr[s1.charAt(i)]=i;
            }
            else{
                res=Math.min(res,fi);
            }
        }
        return (res==Integer.MAX_VALUE)? -1 : res ;
    }

    public static void main(String[] args) {
        String s1="abdcc";
        int naiveAns=leftMost(s1);
        System.out.println(naiveAns);
        int betterAns=leftMostB(s1);
        System.out.println(betterAns);
        int effAns=leftMostE(s1);
        System.out.println(effAns);
    }
}
