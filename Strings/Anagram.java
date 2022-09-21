package Strings;

import java.util.Arrays;

public class Anagram {
    //Anagram-Checks the both strings are matches by permutation
    //number of both the strings and their frequency of the character should be equal
    //order is not necessary
    static boolean anagramNaive(String s1,String s2)
    {
        //if the length of the strings are not equal then it is not a anagram
        if(s1.length()!=s2.length()) return false;
        //create a new char array to store the values of the strings
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();

        //now we can sort the char array
        Arrays.sort(c1);
        Arrays.sort(c2);

        //Convert the character array to string
        s1=Arrays.toString(c1);
        s2=Arrays.toString(c2);

        //Now return true if both the strings are equal
        if(s1.equals(s2))
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1="hello";
        String s2="olel";

        boolean ans= anagramNaive(s1,s2);
        if(ans){
            System.out.println("These strings are anagram ! ");
        }else{
            System.out.println("Not a anagram");
        }
    }
}
